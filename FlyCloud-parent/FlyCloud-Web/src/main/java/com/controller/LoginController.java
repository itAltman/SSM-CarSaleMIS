package com.controller;

import com.pojo.Adminlog;
import com.pojo.Company;
import com.pojo.Employee;
import common.Assist;
import common.MyConst;
import common.PhoneMessageUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.AdminlogService;
import service.CompanyService;
import service.EmployeeService;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static common.Assist.*;

/**
 * @description: 用户登录和注册
 * @author: Altman
 * @date: 2018-04-26 10:05
 */
@Controller
@RequestMapping("login")
public class LoginController {

    private static Logger logger = LogManager.getLogger();

    @Autowired
    CompanyService companyService;
    @Autowired
    EmployeeService employeeService;
    @Autowired
    AdminlogService adminlogService;

    PhoneMessageUtil phoneMessageUtil = new PhoneMessageUtil();

    /**
     * @description: 根据id查询员工对象并转发对象到main.jsp页面
     * @param:
     * @return: goMain
     * @author: Altman
     * @date: 2018-05-04 00:56
    **/
    @RequestMapping("/goMain")
    @ResponseBody
    public ModelAndView goMain(String empId){
        logger.debug("开始--根据id查询员工对象的方法");
        ModelAndView modelAndView = new ModelAndView();

        Employee employeeById = employeeService.selectEmployeeById(Integer.parseInt(empId));
        logger.debug("根据id查询员工对象为：" + employeeById);

        Integer positionId = employeeById.getPositionId();
        if (positionId == MyConst.ADMINPOSITION){
            modelAndView.setViewName("AdminMain");//经理权限
        } else if (positionId == MyConst.EMPPOSITION) {
            modelAndView.setViewName("EmpMain");//操作员权限
        }

        //添加日志管理信息
        Adminlog adminlog = new Adminlog();
        adminlog.setEmpId(Integer.parseInt(empId));
        adminlog.setCompanyId(employeeById.getCompanyId());
        adminlog.setLogContent("访问首页");
        adminlog.setLogTime(new Date());
        int i = adminlogService.insertAdminlog(adminlog);
        logger.debug("添加了"+i+"条日志管理记录");

        modelAndView.addObject("emp",employeeById);
        logger.debug("结束--根据id查询员工对象的方法");
        return modelAndView;
    }

    /**
     * @description: 根据员工信息注册员工对象
     * @param:
     * @return:
     * @author: Altman
     * @date: 2018-05-03 23:38
    **/
    @RequestMapping("/isRegisterSuccess")
    @ResponseBody
    public Map<String, String> isRegisterSuccess(Employee employee){
        logger.debug("开始--创建员工的方法");
        Map<String,String> map = new HashMap<String, String>();

        int count = employeeService.insertEmployee(employee);
        if (count > 0){
            logger.debug("添加员工成功");
            map.put("resultRegister","true");
        } else {
            logger.debug("添加员工失败！");
            map.put("resultRegister","false");
        }

        logger.debug("结束--创建员工的方法");
        return map;
    }


    /**
     * @description: 根据公司名称创建公司并返回id
     * @param: companyName：公司名称
     * @return: Map<String, String>
     * @author: Altman
     * @date: 2018-05-03 23:18
    **/
    @RequestMapping("/insertCompany")
    @ResponseBody
    public Map<String, String> insertCompany(Company company){
        logger.debug("开始--创建公司的方法");
        Map<String,String> map = new HashMap<String, String>();

        int count = companyService.insertCompany(company);
        if (count > 0){
            logger.debug("添加公司成功");
        } else {
            logger.debug("添加公司失败！");
        }

        Company companyByObj = companyService.selectCompanyByObj(company);
        Integer companyId = companyByObj.getCompanyId();
        logger.debug("获取到的公司id为：" + companyId);
        map.put("companyId",companyId.toString());

        logger.debug("结束--创建公司的方法");
        return map;
    }

    /** 
     * @description: 给注册手机发送短信验证码 
     * @param: empPhoneNumber：员工注册手机号码
     * @return: Map<String, String>
     * @author: Altman 
     * @date: 2018-05-03 23:17
    **/ 
    @RequestMapping("/sendPhoneMesseger")
    @ResponseBody
    public Map<String, String> sendPhoneMesseger(String empPhoneNumber){
        logger.debug("开始--发送手机短信的方法");
        Map<String,String> map = new HashMap<String, String>();

        String authcode = phoneMessageUtil.genRandomNum(4);
        logger.debug("手机验证码,生成验证码:"+authcode);

        if(phoneMessageUtil.sandMassage(authcode,empPhoneNumber)){
            logger.debug("验证码发送成功,发送号码:"+empPhoneNumber);
            map.put("resultRegister",authcode);
        }else{
            logger.debug("验证码发送失败,发送号码:"+empPhoneNumber);
            map.put("resultRegister","false");
        }

        logger.debug("结束--发送手机短信的方法");
        return map;
    }


    /**
     * @description: 验证是否登录成功
     * @param: Employee
     * @return: Map<String, String>
     * @author: Altman
     * @date: 2018-04-28 10:56
    **/
    @RequestMapping("/isLoginSuccess")
    @ResponseBody
    public Map<String, String> isLoginSuccess(Employee employee){
        logger.debug("开始--验证是否登录成功的方法");
        logger.debug("前台获取到的employee为："+employee);
        Map<String,String> map = new HashMap<String, String>();

        //设置参数条件
        Assist.WhereRequire<Integer> companyId = andEq("companyId", employee.getCompanyId());
        Assist.WhereRequire<Integer> positionId = andEq("positionId", employee.getPositionId());
        Assist.WhereRequire<String> empName = andEq("empName", employee.getEmpName());
        Assist.WhereRequire<String> empPhone = andEq("empPhone", employee.getEmpPhone());
        Assist.WhereRequire<String> empPassword = andEq("empPassword", employee.getEmpPassword());
        Assist assist = new Assist();
        assist.setRequires(positionId,companyId,empName,empPhone,empPassword);

        long rowCount = employeeService.getEmployeeRowCount(assist);
        logger.debug("getEmployeeRowCount：" + rowCount);
        if (rowCount > 0){
            logger.debug("验证成功，允许登录");
            Employee employeeByObj = employeeService.selectEmployeeByObj(employee);
            Integer empId = employeeByObj.getEmpId();
            map.put("resultLogin",empId.toString());

            //添加日志管理信息
            Adminlog adminlog = new Adminlog();
            adminlog.setEmpId(empId);
            adminlog.setCompanyId(employeeByObj.getCompanyId());
            adminlog.setLogContent("登录系统");
            adminlog.setLogTime(new Date());
            int i = adminlogService.insertAdminlog(adminlog);
            logger.debug("添加了"+i+"条日志管理记录");

        } else {
            logger.debug("验证失败，拒绝登录");
            map.put("resultLogin","false");
        }

        logger.debug("结束--验证是否登录成功的方法");
        return map;
    }

    /**
     * @description: 根据公司名称查询公司id
     * @param: Company
     * @return: Map<String, String>
     * @author: Altman
     * @date: 2018-04-28 10:52
    **/
    @RequestMapping("/getCompanyId")
    @ResponseBody
    public Map<String, String> getCompanyId(Company company){
        logger.debug("开始--获取公司id的方法");
        Map<String,String> map = new HashMap<String, String>();

        Company companyByObj = companyService.selectCompanyByObj(company);
        Integer companyId = companyByObj.getCompanyId();
        map.put("companyId",companyId.toString());

        logger.debug("结束--获取公司id的方法");
        return map;
    }

    /**
     * @description: 根据公司姓名查询
     * @param: Company
     * @return: Map<String, String>
     * @author: Altman
     * @date: 2018-04-26 17:06
    **/
    @RequestMapping("/isExistCompanyName")
    @ResponseBody
    public Map<String, String> isExistCompanyName(Company company){
        logger.debug("开始--验证公司名称的方法");
        Map<String,String> map = new HashMap<String, String>();

        Company companyByObj = companyService.selectCompanyByObj(company);
        if (companyByObj == null){
            logger.debug("没有找到此公司名称");
            map.put("resultName","false");
        } else {
            logger.debug("找到此公司名称");
            map.put("resultName","true");
        }

        logger.debug("结束--验证公司名称的方法");
        return map;
    }

    /** 
     * @description: 验证员工电话 
     * @param: employee员工对象
     * @return: Map<String, String>
     * @author: Altman 
     * @date: 2018-05-04 01:09
    **/ 
    @RequestMapping("/isExistEmpPhone")
    @ResponseBody
    public Map<String, String> isExistEmpPhone(Employee employee){
        logger.debug("开始--验证员工电话的方法");
        Map<String,String> map = new HashMap<String, String>();
        logger.debug("前台获取到的emp：" + employee);
        Employee employeeByObj = employeeService.selectEmployeeByObj(employee);
        logger.debug("后台查询到的emp：" + employee);

        if (employeeByObj == null){
            logger.debug("没有找到此员工电话");
            map.put("resultName","false");
        } else{
            logger.debug("找到此员工电话");
            map.put("resultName","true");
        }

        logger.debug("结束--验证员工电话的方法");
        return map;
    }

    /**
     * @description: 验证员工信息
     * @param: Employee
     * @return: Map<String, String>
     * @author: Altman
     * @date: 2018-04-28 08:03
    **/
    @RequestMapping("/isExistEmpName")
    @ResponseBody
    public Map<String, String> isExistEmpName(Employee employee){
        logger.debug("开始--验证员工名称的方法");
        Map<String,String> map = new HashMap<String, String>();

        Employee employeeByObj = employeeService.selectEmployeeByObj(employee);

        if (employeeByObj == null){
            logger.debug("没有找到此员工名称");
            map.put("resultName","false");
        } else{
            logger.debug("找到此员工名称");
            map.put("resultName","true");
        }

        logger.debug("结束--验证员工名称的方法");
        return map;
    }



}
