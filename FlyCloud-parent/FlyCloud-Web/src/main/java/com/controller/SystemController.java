package com.controller;

import com.pojo.Adminlog;
import com.pojo.Customer;
import com.pojo.Employee;
import common.Assist;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.AdminlogService;
import service.EmployeeService;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 系统设置控制器
 * @author: Altman
 * @date: 2018-05-10 10:16
 */
@Controller
@RequestMapping("system")
public class SystemController {
    private static Logger logger = LogManager.getLogger();

    @Autowired
    EmployeeService employeeService;
    @Autowired
    AdminlogService adminlogService;

    /**
     * @description: 根据公司id查询所有日志信息
     * @param:
     * @return:
     * @author: Altman
     * @date: 2018-05-10 12:43
    **/
    @RequestMapping("/getAllLog")
    public ModelAndView getAllLog(String empId){
        logger.debug("开始--根据公司id查询所有日志信息的方法");
        logger.debug("前台获取到的empId为："+empId);

        //根据用户id查询用户，并获取到公司编号companyId
        Employee employeeById = employeeService.selectEmployeeById(Integer.parseInt(empId));
        Integer companyId = employeeById.getCompanyId();

        //根据登录用户的公司编号查询所有的
        Assist assist = new Assist();
        assist.setRequires(Assist.andEq("adminlog.companyId", companyId));
        List<Adminlog> adminlogList = adminlogService.selectAdminlog(assist);
        logger.debug("查询的结果为："+adminlogList);

        //创建ModelAndView用来存放数据和视图
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("emp",employeeById);
        modelAndView.addObject("adminlogList",adminlogList);
        modelAndView.setViewName("AdminLogList");

        logger.debug("结束--根据公司id查询所有日志信息的方法");
        return modelAndView;
    }

    /**
     * @description: 根据员工id删除员工
     * @param:
     * @return:
     * @author: Altman
     * @date: 2018-05-10 12:23
    **/
    @RequestMapping("/deleteEmployeeById")
    public String deleteEmployeeById(String adminEmpId,String empId){
        logger.debug("开始--根据员工id删除员工的方法");
        logger.debug("前台获取到当前用户为:"+adminEmpId);
        logger.debug("前台获取到的需要删除的empId为:"+empId);

        //根据所有信息修改客户
        int deleteEmployeeCount = employeeService.deleteEmployeeById(Integer.parseInt(empId));
        logger.debug("删除"+deleteEmployeeCount+"条数据");

        //添加日志管理信息
        Employee employeeById = employeeService.selectEmployeeById(Integer.parseInt(empId));
        Adminlog adminlog = new Adminlog();
        adminlog.setEmpId(Integer.parseInt(empId));
        adminlog.setCompanyId(employeeById.getCompanyId());
        adminlog.setLogContent("删除了员工信息");
        adminlog.setLogTime(new Date());
        int i = adminlogService.insertAdminlog(adminlog);
        logger.debug("添加了"+i+"条日志管理记录");

        logger.debug("结束--根据员工id删除员工的方法");
        return "redirect:/system/getAllEmp.action?empId="+adminEmpId;
    }

    /**
     * @description: 根据empId修改员工信息
     * @param:
     * @return:
     * @author: Altman
     * @date: 2018-05-10 12:10
    **/
    @RequestMapping("/updateEmployee")
    public String updateEmployee(Employee employee, String empId){
        logger.debug("开始--根据empId修改员工信息的方法");
        logger.debug("获取到的需要修改的employee的信息:"+employee);

        //根据所有信息修改客户
        int updateEmployeeCount = employeeService.updateNonEmptyEmployeeById(employee);
        logger.debug("修改"+updateEmployeeCount+"条数据");

        //添加日志管理信息
        Employee employeeById = employeeService.selectEmployeeById(Integer.parseInt(empId));
        Adminlog adminlog = new Adminlog();
        adminlog.setEmpId(Integer.parseInt(empId));
        adminlog.setCompanyId(employeeById.getCompanyId());
        adminlog.setLogContent("修改了员工信息");
        adminlog.setLogTime(new Date());
        int i = adminlogService.insertAdminlog(adminlog);
        logger.debug("添加了"+i+"条日志管理记录");

        logger.debug("结束--根据empId修改员工信息的方法");
        return "redirect:/system/getAllEmp.action?empId="+empId;
    }

    /**
     * @description: 根据empId查询员工信息
     * @param:
     * @return: getEmployeeById
     * @author: Altman
     * @date: 2018-05-10 11:24
    **/
    @RequestMapping("/getEmployeeById")
    @ResponseBody
    public Map<String, Employee> getEmployeeById(String empId){
        logger.debug("开始--根据empId查询员工信息的方法");
        logger.debug("前台获取的empId："+empId);
        Map<String, Employee> map = new HashMap<String, Employee>();

        Employee employeeById = employeeService.selectEmployeeById(Integer.parseInt(empId));
        logger.debug("根据id查询到的employeeById为：" + employeeById);
        map.put("employeeById",employeeById);

        logger.debug("结束--根据empId查询员工信息的方法");
        return map;
    }

    /**
     * @description: 添加员工信息
     * @param:
     * @return:
     * @author: Altman
     * @date: 2018-05-10 10:48
    **/
    @RequestMapping("/insertEmployee")
    public String insertEmployee(Employee employee,String adminEmpId){
        logger.debug("开始--添加员工信息的方法");
        logger.debug("从前台获取的employee为:" + employee);
        logger.debug("从前台获取的adminEmpId为:" + adminEmpId);

        //根据所有信息添加客户
        int insertEmployeeCount = employeeService.insertEmployee(employee);
        logger.debug("添加"+insertEmployeeCount+"条数据");

        //添加日志管理信息
        Employee employeeById = employeeService.selectEmployeeById(Integer.parseInt(adminEmpId));
        Adminlog adminlog = new Adminlog();
        adminlog.setEmpId(Integer.parseInt(adminEmpId));
        adminlog.setCompanyId(employeeById.getCompanyId());
        adminlog.setLogContent("添加了员工信息");
        adminlog.setLogTime(new Date());
        int i = adminlogService.insertAdminlog(adminlog);
        logger.debug("添加了"+i+"条日志管理记录");

        logger.debug("结束--添加员工信息的方法");
        return "redirect:../system/getAllEmp.action?empId="+adminEmpId;
    }

    /** 
     * @description: 根据登录用户的公司编号查询所有的员工资料
     * @param:
     * @return:
     * @author: Altman 
     * @date: 2018-05-10 10:19
    **/ 
    @RequestMapping("/getAllEmp")
    public ModelAndView getAllCustomer(String empId){
        logger.debug("开始--根据登录用户的公司编号查询所有的员工资料的方法");

        //根据用户id查询用户，并获取到公司编号companyId
        Employee employeeById = employeeService.selectEmployeeById(Integer.parseInt(empId));
        Integer companyId = employeeById.getCompanyId();

        //根据登录用户的公司编号查询所有的
        Assist assist = new Assist();
        assist.setRequires(Assist.andEq("employee.companyId", companyId));
        assist.setRequires(Assist.andNeq("employee.positionId", 1));//设置职位不为经理的员工
        List<Employee> employeeList = employeeService.selectEmployee(assist);
        logger.debug("查询的结果为："+employeeList);

        //创建ModelAndView用来存放数据和视图
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("emp",employeeById);
        modelAndView.addObject("employeeList",employeeList);
        modelAndView.setViewName("AdminEmpList");

        //添加日志管理信息
        Adminlog adminlog = new Adminlog();
        adminlog.setEmpId(Integer.parseInt(empId));
        adminlog.setCompanyId(employeeById.getCompanyId());
        adminlog.setLogContent("查询了所有的员工");
        adminlog.setLogTime(new Date());
        int i = adminlogService.insertAdminlog(adminlog);
        logger.debug("添加了"+i+"条日志管理记录");

        logger.debug("结束--根据登录用户的公司编号查询所有的员工资料的方法");
        return modelAndView;
    }

}
