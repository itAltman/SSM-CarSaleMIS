package com.controller;

import com.pojo.Adminlog;
import com.pojo.Employee;
import com.pojo.Repertory;
import common.Assist;
import common.MyConst;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.AdminlogService;
import service.EmployeeService;
import service.RepertoryService;

import java.util.Date;
import java.util.List;

/**
 * @description: 库存控制器
 * @author: Altman
 * @date: 2018-05-07 15:04
 */
@Controller
@RequestMapping("repertory")
public class RepertoryController {
    private static Logger logger = LogManager.getLogger();
    
    @Autowired
    EmployeeService employeeService;
    @Autowired
    RepertoryService repertoryService;
    @Autowired
    AdminlogService adminlogService;

    /** 
     * @description: 根据公司id查询所有库存 
     * @param:
     * @return:
     * @author: Altman 
     * @date: 2018-05-07 15:06
    **/ 
    @RequestMapping("/getAllRepertory")
    public ModelAndView getAllRepertory(String empId){
        logger.debug("开始--查询库存的方法");
        logger.debug("获取的前端员工empId为：" + empId);

        //根据用户id查询用户，并获取到公司编号companyId
        Employee employeeById = employeeService.selectEmployeeById(Integer.parseInt(empId));
        Integer positionId = employeeById.getPositionId();
        Integer companyId = employeeById.getCompanyId();

        //根据登录用户的公司编号查询所有的
        Assist assist = new Assist();
        assist.setRequires(Assist.andEq("repertory.companyId", companyId));
        assist.setRequires(Assist.andGt("repertoryNum",0));
        List<Repertory> repertoryList = repertoryService.selectRepertory(assist);
        logger.debug("查询的结果为："+repertoryList);

        //创建ModelAndView用来存放数据和视图
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("emp",employeeById);
        modelAndView.addObject("repertoryList",repertoryList);

        if (positionId == MyConst.ADMINPOSITION){
            modelAndView.setViewName("AdminRepertoryList");//经理权限
        } else if (positionId == MyConst.EMPPOSITION) {
            modelAndView.setViewName("EmpRepertoryList");//操作员权限
        }

        //添加日志管理信息
        Adminlog adminlog = new Adminlog();
        adminlog.setEmpId(Integer.parseInt(empId));
        adminlog.setCompanyId(employeeById.getCompanyId());
        adminlog.setLogContent("查询了库存");
        adminlog.setLogTime(new Date());
        int i = adminlogService.insertAdminlog(adminlog);
        logger.debug("添加了"+i+"条日志管理记录");

        logger.debug("结束--查询库存的方法");
        return modelAndView;
    }

}
