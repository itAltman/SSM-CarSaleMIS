package com.controller;

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
import service.CustomerService;
import service.EmployeeService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
     * @description: 根据客户id删除客户信息
     * @param:
     * @return: deleteCustomerById
     * @author: Altman
     * @date: 2018-05-06 20:43
    **/
    @RequestMapping("/deleteCustomerById")
    public String deleteCustomerById(String customerId,String empId){
        logger.debug("开始--根据客户id删除客户信息的方法");
        logger.debug("获取到的需要删除的customer的id为:"+customerId);

        //根据所有信息修改客户
        int count = customerService.deleteCustomerById(Integer.parseInt(customerId));
        if (count > 0) {
            logger.debug("删除客户成功:" + count);
        } else {
            logger.debug("删除客户失败:" + count);
        }

        logger.debug("结束--根据客户id删除客户信息的方法");
        return "redirect:/customer/getAllCustomer.action?empId="+empId;
    }

    /** 
     * @description: 修改客户信息
     * @param:
     * @return:
     * @author: Altman 
     * @date: 2018-05-06 19:38
    **/ 
    @RequestMapping("/updateCustomer")
    public String updateCustomer(Customer customer,String empId){
        logger.debug("开始--修改客户资料的方法");
        logger.debug("获取到的需要修改的customer的信息:"+customer);

        //根据所有信息修改客户
        int count = customerService.updateCustomerById(customer);
        if (count > 0) {
            logger.debug("修改客户成功:" + count);
        } else {
            logger.debug("修改客户失败:" + count);
        }

        logger.debug("结束--添加客户资料的方法");
        return "redirect:/customer/getAllCustomer.action?empId="+empId;
    }

    /** 
     * @description: 根据客户id查询客户对象 
     * @param:
     * @return: 
     * @author: Altman 
     * @date: 2018-05-06 17:35
    **/ 
    @RequestMapping("/getCustomerById")
    @ResponseBody
    public Map<String, Customer> getCustomerById(String customerId){
        logger.debug("开始--根据id查询客户的方法");
        Map<String,Customer> map = new HashMap<String, Customer>();

        Customer customerById = customerService.selectCustomerById(Integer.parseInt(customerId));
        logger.debug("根据id查询到的客户为：" + customerById);
        map.put("customer",customerById);

        logger.debug("结束--根据id查询客户的方法");
        return map;
    }
    
    /** 
     * @description: 添加客户，并根据员工id转向到getAllCustomer.action 
     * @param:
     * @return: 
     * @author: Altman 
     * @date: 2018-05-06 16:37
    **/ 
    @RequestMapping("/insertCustomer")
    public String insertCustomer(Customer customer,String empId){
        logger.debug("开始--添加客户资料的方法");
        logger.debug("添加客户的信息为:" + customer);

        //根据所有信息添加客户
        int count = customerService.insertCustomer(customer);
        if (count > 0) {
            logger.debug("添加客户成功:" + count);
        } else {
            logger.debug("添加客户失败:" + count);
        }

        logger.debug("结束--添加客户资料的方法");
        return "redirect:/customer/getAllCustomer.action?empId="+empId;
    }

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
        modelAndView.setViewName("customerList");

        logger.debug("结束--查询客户资料的方法");
        return modelAndView;
    }

}
