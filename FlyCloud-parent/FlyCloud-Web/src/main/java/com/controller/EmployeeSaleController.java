package com.controller;

import com.pojo.Car;
import com.pojo.Employee;
import com.pojo.Financing;
import com.pojo.Sale;
import com.vo.SaleData;
import common.Assist;
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
import service.SaleService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/employeeSale")
public class EmployeeSaleController {
    private static Logger logger = LogManager.getLogger();

    @Autowired
    CompanyService companyService;
    @Autowired
    EmployeeService employeeService;
    @Autowired
    FinancingService financingService;
    @Autowired
    SaleService saleService;

    @RequestMapping("/getEmpId")
    @ResponseBody
    public ModelAndView getEmpId(String empId){
        logger.debug("接收empid的值");
        ModelAndView modelAndView = new ModelAndView();
        //${pageContext.request.contextPath}/employeeSale/getEmpId.action?empId=${emp.empId}
        //根据用户id查询用户，并获取到公司编号companyId
        Employee employeeById = employeeService.selectEmployeeById(Integer.parseInt(empId));
        modelAndView.addObject("emp",employeeById);//转发emp
        modelAndView.setViewName("AdminEmployeeSale");//页面名称
        logger.debug("发送empid的值到AdminEmployeeSale.jsp");
        return modelAndView;
    }

    @RequestMapping("/getEmployeeSaleCondition")
    @ResponseBody
    public Map<String ,List<SaleData>> getFinanceCondition(String empId){
        logger.debug("开始--查询销售表的数据并传递到页面");
        Map<String ,List<SaleData>>  map = new HashMap<String ,List<SaleData>>();
        //${pageContext.request.contextPath}/employeeSale/getEmployeeSaleCondition.action?empId=${emp.empId}
        Employee employee = employeeService.selectEmployeeById(Integer.parseInt(empId));//根据empid查询雇员信息
        Integer companyId = employee.getCompanyId();//根据雇员信息查讯公司id

        Assist assist = new Assist();
        assist.setRequires(Assist.andEq("sale.companyId",companyId));//where条件

        List<Sale> employeeSale  = saleService.selectSale(assist);//查询companyId对应的所有的销售信息
        List<SaleData> data = new ArrayList<SaleData>();//整合销售信息, 将value和name传入页面
        Boolean flag = false;

        //第一次进入
        Sale sale = employeeSale.get(0);
        String localName = sale.getEmployee().getEmpName();
        Double localValue = sale.getSaleTotalPrice();

        SaleData saleData = new SaleData();
        saleData.setName(localName);
        saleData.setValue(localValue);
        data.add(saleData);

        //第二次及以后
        for (int i=1; i<employeeSale.size(); i++) {
            Sale sale1 = employeeSale.get(i);
            String localName1 = sale1.getEmployee().getEmpName();
            Double localValue1 = sale1.getSaleTotalPrice();
            for(int j=0; j<data.size(); j++){
                SaleData sdata = data.get(j);
                if (localName1.equals(sdata.getName())){
                    sdata.setValue(sdata.getValue()+localValue1);
                } else {
                    SaleData  saleData1 = new SaleData();
                    saleData1.setName(localName1);
                    saleData1.setValue(localValue1);
                    data.add(saleData1);
                    break;
                }
            }
        }

        logger.debug("销售表的数据"+employeeSale);
        logger.debug("SaleData的数据"+data);


        map.put("employeeSale",data);
        logger.debug("结束--查询销售表中的数据并传递到页面");
        return map;
    }
}
