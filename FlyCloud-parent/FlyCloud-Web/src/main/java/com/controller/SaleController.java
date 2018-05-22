package com.controller;

import com.pojo.Adminlog;
import com.pojo.Carorder;
import com.pojo.Carseries;
import com.pojo.Customer;
import com.pojo.Employee;
import com.pojo.Financing;
import com.pojo.Repertory;
import com.pojo.Sale;
import common.Assist;
import common.MyConst;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.AdminlogService;
import service.CarseriesService;
import service.CustomerService;
import service.EmployeeService;
import service.FinancingService;
import service.RepertoryService;
import service.SaleService;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 销售控制器
 * @author: Altman
 * @date: 2018-05-07 10:21
 */
@Controller
@RequestMapping("sale")
public class SaleController {
    private static Logger logger = LogManager.getLogger();

    @Autowired
    EmployeeService employeeService;
    @Autowired
    SaleService saleService;
    @Autowired
    CustomerService customerService;
    @Autowired
    RepertoryService repertoryService;
    @Autowired
    CarseriesService carseriesService;
    @Autowired
    FinancingService financingService;
    @Autowired
    AdminlogService adminlogService;

    /**
     * @description: 客户付款：根据销售id修改销售状态
     * @param:  updateSaleById
     * @return:
     * @author: Altman
     * @date: 2018-05-09 22:58
    **/
    @RequestMapping("/updateSaleById")
    public String updateSaleById(String empId,String saleId){
        logger.debug("开始--客户付款的方法");
        logger.debug("前台获取到的empId："+empId);
        logger.debug("前台获取到的saleId："+saleId);

        //根据订单id修改订单对象的orderType字段
        Sale sale = new Sale();
        sale.setSaleId(Integer.parseInt(saleId));
        sale.setSaleType(MyConst.HASPAYING);//已付款
        int updateSaleCount = saleService.updateNonEmptySaleById(sale);
        logger.debug("修改"+ updateSaleCount +"条数据");
        if (updateSaleCount > 0) {
            //如果修改成功,代表付款成功,这时候财务也需要增加一笔
            Sale saleById = saleService.selectSaleById(Integer.parseInt(saleId));
            logger.debug("根据订单获取到的订单对象carorderById为：" + saleById);
            Financing financing = new Financing();
            financing.setSaleId(Integer.parseInt(saleId));
            financing.setCompanyId(saleById.getCompanyId());
            financing.setFinancingMoney(saleById.getSaleTotalPrice());
            financing.setFinancingType(MyConst.INCOME);
            int insertFinancingCount = financingService.insertFinancing(financing);
            logger.debug("财务添加"+ insertFinancingCount +"条支出数据");
            logger.debug("数据financing为："+financing);

            //根据carId获取库存对象，并对其中的repertory字段进行减1操作
            Integer carId = saleById.getCarId();
            Assist assist = new Assist();
            assist.setRequires(Assist.andEq("repertory.carId",carId));
            assist.setRequires(Assist.andGt("repertoryNum",0));
            List<Repertory> repertoryList = repertoryService.selectRepertory(assist);
            Repertory repertory = repertoryList.get(0);
            Integer repertoryNum = repertory.getRepertoryNum();
            //获取数量
            repertoryNum--;
            repertory.setRepertoryNum(repertoryNum);
            logger.debug("carId为："+carId+"的库存有："+repertory);
            int updateRepertoryCount = repertoryService.updateNonEmptyRepertoryById(repertory);
            logger.debug("修改"+ updateRepertoryCount +"条库存数据");

            //添加日志管理信息
            Employee employeeById = employeeService.selectEmployeeById(Integer.parseInt(empId));
            Adminlog adminlog = new Adminlog();
            adminlog.setEmpId(Integer.parseInt(empId));
            adminlog.setCompanyId(employeeById.getCompanyId());
            adminlog.setLogContent("收取了客户的汽车购置款");
            adminlog.setLogTime(new Date());
            int i = adminlogService.insertAdminlog(adminlog);
            logger.debug("添加了"+i+"条日志管理记录");
        }

        //重定向到库存了
        logger.debug("结束--客户付款的方法");
        return "redirect:../sale/getAllSale.action?empId="+empId;
    }


    /**
     * @description: 添加销售
     * @param:
     * @return: insertSale
     * @author: Altman
     * @date: 2018-05-09 21:00
    **/
    @RequestMapping("/insertSale")
    public String insertSale(Sale sale,String adminEmpId){
        logger.debug("开始--添加销售的方法");
        logger.debug("获取的前台销售信息sale :"+sale);
        logger.debug("获取的前台adminEmpId :"+adminEmpId);

        //根据单价和数量算出总价
        Double saleCurPrice = sale.getSaleCurPrice();//单价
        Integer saleNum = sale.getSaleNum();//数量
        double totalPrice = saleCurPrice * saleNum;
        sale.setSaleTotalPrice(totalPrice);
        sale.setSaleTime(new Date());

        //添加销售单
        int insertSale = saleService.insertSale(sale);
        logger.debug("新增"+insertSale+"条数据");

        //添加日志管理信息
        Employee employeeById = employeeService.selectEmployeeById(Integer.parseInt(adminEmpId));
        Adminlog adminlog = new Adminlog();
        adminlog.setEmpId(Integer.parseInt(adminEmpId));
        adminlog.setCompanyId(employeeById.getCompanyId());
        adminlog.setLogContent("添加了汽车销售订单");
        adminlog.setLogTime(new Date());
        int i = adminlogService.insertAdminlog(adminlog);
        logger.debug("添加了"+i+"条日志管理记录");

        logger.debug("结束--添加销售的方法");
        return "redirect:../sale/getAllSale.action?empId="+adminEmpId;
    }

    /**
     * @description: 根据公司编号查询销售员工
     * @param:  getAllEmpByCompanyId
     * @return:
     * @author: Altman
     * @date: 2018-05-09 20:13
    **/
    @RequestMapping("/getAllEmpByCompanyId")
    @ResponseBody
    public Map<String, List<Employee>> getAllEmpByCompanyId(String companyId){
        logger.debug("开始--根据公司编号查询销售员工的方法");
        Map<String, List<Employee>> map = new HashMap<String, List<Employee>>();
        logger.debug("前台获取到的companyId：" + companyId);

        Assist assist = new Assist();
        assist.setRequires(Assist.andEq("employee.companyId",companyId));
        assist.setRequires(Assist.andEq("employee.positionId",3));
        List<Employee> employeeList = employeeService.selectEmployee(assist);
        logger.debug("后台查询到的employeeList：" + employeeList);

        map.put("employeeList",employeeList);

        logger.debug("结束--根据公司编号查询销售员工的方法");
        return map;
    }

    /** 
     * @description: 根据车系id获取车系名称和车系品牌 
     * @param:  getCarSeriesById
     * @return:
     * @author: Altman 
     * @date: 2018-05-09 19:15
    **/
    @RequestMapping("/getCarSeriesById")
    @ResponseBody
    public Map<String, Carseries> getCarSeriesById(String seriesId){
        logger.debug("开始--根据车系id获取车系名称和车系品牌的方法");
        Map<String, Carseries> map = new HashMap<String, Carseries>();
        logger.debug("前台获取到的seriesId：" + seriesId);

        Carseries carseriesById = carseriesService.selectCarseriesById(Integer.parseInt(seriesId));
        logger.debug("后台查询到的carseriesById：" + carseriesById);

        map.put("carseriesById",carseriesById);

        logger.debug("结束--根据车系id获取车系名称和车系品牌的方法");
        return map;
    }
    
    /** 
     * @description: 根据公司id获取所有库存汽车 
     * @param:  getAllRepertoryCarName
     * @return:
     * @author: Altman 
     * @date: 2018-05-09 18:33
    **/
    @RequestMapping("/getAllRepertoryCarName")
    @ResponseBody
    public Map<String, List<Repertory>> getAllRepertoryCarName(String companyId){
        logger.debug("开始--根据公司id获取所有库存汽车的方法");
        Map<String, List<Repertory>> map = new HashMap<String, List<Repertory>>();
        logger.debug("前台获取到的companyId：" + companyId);
        Assist assist = new Assist();
        assist.setRequires(Assist.andEq("repertory.companyId",companyId));
        assist.setRequires(Assist.andGt("repertoryNum",0));
        List<Repertory> repertoryList = repertoryService.selectRepertory(assist);
        logger.debug("后台查询到的repertoryList：" + repertoryList);

        map.put("repertoryList",repertoryList);

        logger.debug("结束--根据公司id获取所有库存汽车的方法");
        return map;
    }

    /**
     * @description: 购车客户输入框失去焦点事件 判断是否存在
     * @param:
     * @return:
     * @author: Altman
     * @date: 2018-05-09 17:01
    **/
    @RequestMapping("/getCustomerByPhone")
    @ResponseBody
    public Map<String, List<Customer>> getCustomerByPhone(String customerPhone){
        logger.debug("开始--判断客户电话是否存在的方法");
        Map<String, List<Customer>> map = new HashMap<String, List<Customer>>();
        logger.debug("前台获取到的customerPhone：" + customerPhone);
        Assist assist = new Assist();
        assist.setRequires(Assist.andEq("customerPhone",customerPhone));
        List<Customer> customerList = customerService.selectCustomer(assist);
        logger.debug("后台查询到的customerList：" + customerList);

        map.put("customerList",customerList);

        logger.debug("结束--判断客户电话是否存在的方法");
        return map;
    }

    /**
     * @description: 根据公司id获取所有客户
     * @param: getAllCustomerToSale
     * @return:
     * @author: Altman
     * @date: 2018-05-09 11:38
    **/
    @RequestMapping("/getAllCustomerToSale")
    @ResponseBody
    public Map<String, List<Customer>> getAllCustomerToSale(String companyId){
        logger.debug("开始--根据公司id获取所有客户的方法");
        Map<String,List<Customer>> map = new HashMap<String, List<Customer>>();

        //根据登录用户的公司编号查询所有的
        Assist assist = new Assist();
        assist.setRequires(Assist.andEq("customer.companyId", companyId));
        List<Customer> customerList = customerService.selectCustomer(assist);
        logger.debug("查询的结果为："+customerList);

        map.put("customerList",customerList);

        logger.debug("结束--查询客户资料的方法");
        return map;
    }

    
    /** 
     * @description: 获取所有销售 
     * @param:
     * @return:
     * @author: Altman 
     * @date: 2018-05-09 11:37
    **/ 
    @RequestMapping("/getAllSale")
    public ModelAndView getAllSale(String empId){
        logger.debug("开始--查询销售的方法");
        logger.debug("获取的前台员工编号:"+empId);

        //根据用户id查询用户，并获取到公司编号companyId和职位编号positionId
        Employee employeeById = employeeService.selectEmployeeById(Integer.parseInt(empId));
        Integer positionId = employeeById.getPositionId();
        Integer companyId = employeeById.getCompanyId();

        //根据登录用户的公司编号查询所有的
        Assist assist = new Assist();
        assist.setRequires(Assist.andEq("sale.companyId", companyId));
        List<Sale> saleList = saleService.selectSale(assist);
        logger.debug("查询的结果为："+saleList);

        //创建ModelAndView用来存放数据和视图
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("emp",employeeById);
        modelAndView.addObject("saleList",saleList);

        if (positionId == MyConst.ADMINPOSITION){
            modelAndView.setViewName("AdminSaleList");//经理权限
        } else if (positionId == MyConst.EMPPOSITION) {
            modelAndView.setViewName("EmpSaleList");//操作员权限
        }

        //添加日志管理信息
        Adminlog adminlog = new Adminlog();
        adminlog.setEmpId(Integer.parseInt(empId));
        adminlog.setCompanyId(employeeById.getCompanyId());
        adminlog.setLogContent("查询了所有销售订单");
        adminlog.setLogTime(new Date());
        int i = adminlogService.insertAdminlog(adminlog);
        logger.debug("添加了"+i+"条日志管理记录");

        logger.debug("结束--查询客户资料的方法");
        return modelAndView;
    }
}
