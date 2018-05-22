package com.controller;

import com.pojo.Employee;
import com.pojo.Financing;
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
import service.CompanyService;
import service.EmployeeService;
import service.FinancingService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/finance")
public class FinanceController {
    private static Logger logger = LogManager.getLogger();

    @Autowired
    CompanyService companyService;
    @Autowired
    EmployeeService employeeService;
    @Autowired
    FinancingService financingService;

    @RequestMapping("/getEmpId")
    @ResponseBody
    public ModelAndView getEmpId(String empId){
        logger.debug("接收empid的值");
        ModelAndView modelAndView = new ModelAndView();
        //${pageContext.request.contextPath}/finance/getEmpId.action?empId=${emp.empId}
        //根据用户id查询用户，并获取到雇员编号companyId
        Employee employeeById = employeeService.selectEmployeeById(Integer.parseInt(empId));
        modelAndView.addObject("emp",employeeById);//转发emp
        modelAndView.setViewName("AdminFinanceCondition");//页面名称
        logger.debug("发送empid的值到AdminFinanceCondition.jsp");
        return modelAndView;
    }

    /**
     * @description: 根据id查询员工对象并转发对象到main.jsp页面
     * @param:
     * @return: financeCondition
     * @author: Altman
     * @date: 2018-05-04 00:56
     **/
    @RequestMapping("/getFinanceCondition")
    @ResponseBody
    public Map<String ,List<Financing>> getFinanceCondition(String empId){
        logger.debug("开始--查询财务表中的数据并传递到页面");
        Map<String ,List<Financing>>  map = new  HashMap<String ,List<Financing>>();
        //${pageContext.request.contextPath}/finance/getFinanceCondition.action?empId=${emp.empId}
        Employee employee = employeeService.selectEmployeeById(Integer.parseInt(empId));//根据empid查询雇员信息
        Integer companyId = employee.getCompanyId();//根据雇员信息查讯公司id

        Assist assist = new Assist();
        assist.setRequires(Assist.andEq("financing.companyId",companyId));//where条件

        List<Financing> financeCondition  = financingService.selectFinancing(assist);//查询companyId对应的所有的财务信息
        logger.debug("财务表的数据"+financeCondition);
        map.put("financeCondition",financeCondition);
        logger.debug("结束--查询财务表中的数据并传递到页面");
        return map;
    }
}
