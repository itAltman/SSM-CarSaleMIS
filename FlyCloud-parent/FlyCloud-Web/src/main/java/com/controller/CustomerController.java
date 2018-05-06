package com.controller;

import com.pojo.Customer;
import com.pojo.Employee;
import common.Assist;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.CustomerService;
import service.EmployeeService;

import java.util.List;

/**
 * @description: 客户操作类
 * @author: Altman
 * @date: 2018-05-03 11:32
 */
@Controller
@RequestMapping("customer")
public class CustomerController {
    private static Logger logger = LogManager.getLogger();

    @Autowired
    CustomerService customerService;
    @Autowired
    EmployeeService employeeService;

    /** 
     * @description: 根据登录用户的公司编号查询所有的客户资料
     * @param: empId用户编号
     * @return: String转发到listCustomer.jsp页面
     * @author: Altman 
     * @date: 2018-05-03 11:36
    **/ 
    @RequestMapping("/getAllCustomer")
    public ModelAndView getAllCustomer(String empId){
        logger.debug("开始--查询客户资料的方法");

        //根据用户id查询用户，并获取到公司编号companyId
        Employee employeeById = employeeService.selectEmployeeById(Integer.parseInt(empId));
        Integer companyId = employeeById.getCompanyId();

        //根据登录用户的公司编号查询所有的
        Assist assist = new Assist();
        assist.setRequires(Assist.andEq("customer.companyId", companyId));
        List<Customer> customerList = customerService.selectCustomer(assist);
        logger.debug("查询的结果为："+customerList);

        //创建ModelAndView用来存放数据和视图
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("emp",employeeById);
        modelAndView.addObject("customerList",customerList);
        modelAndView.setViewName("listCustomer");

        logger.debug("结束--查询客户资料的方法");
        return modelAndView;
    }

}
