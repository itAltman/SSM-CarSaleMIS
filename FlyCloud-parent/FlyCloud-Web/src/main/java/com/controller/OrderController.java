package com.controller;

import com.pojo.Adminlog;
import com.pojo.Car;
import com.pojo.Carbrand;
import com.pojo.Carorder;
import com.pojo.Carseries;
import com.pojo.Employee;
import com.pojo.Financing;
import com.pojo.Repertory;
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
import service.CarService;
import service.CarbrandService;
import service.CarorderService;
import service.CarseriesService;
import service.EmployeeService;
import service.FinancingService;
import service.RepertoryService;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 订单控制器
 * @author: Altman
 * @date: 2018-05-08 08:59
 */
@Controller
@RequestMapping("order")
public class OrderController {
    private static Logger logger = LogManager.getLogger();

    @Autowired
    CarbrandService carbrandService;
    @Autowired
    CarseriesService carseriesService;
    @Autowired
    CarService carService;
    @Autowired
    CarorderService carorderService;
    @Autowired
    EmployeeService employeeService;
    @Autowired
    FinancingService financingService;
    @Autowired
    RepertoryService repertoryService;
    @Autowired
    AdminlogService adminlogService;

    /**
     * @description:  收款查询：根据公司查询所有销售单
     * @param:  getAllReceipt
     * @return:
     * @author: Altman
     * @date: 2018-05-09 23:25
    **/
    @RequestMapping("/getAllReceipt")
    public ModelAndView getAllReceipt(String empId){
        logger.debug("开始--收款查询：根据公司查询所有销售单的方法");

        //根据用户id查询用户，并获取到公司编号companyId
        Employee employeeById = employeeService.selectEmployeeById(Integer.parseInt(empId));
        Integer companyId = employeeById.getCompanyId();

        //根据登录用户的公司编号查询所有收入单
        Assist assist = new Assist();
        assist.setRequires(Assist.andEq("financing.companyId", companyId));
        assist.setRequires(Assist.andEq("financingType", MyConst.INCOME));
        List<Financing> financingList = financingService.selectFinancing(assist);
        logger.debug("根据公司id和income类型查询的financingList结果为："+financingList);

        //创建ModelAndView用来存放数据和视图
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("emp",employeeById);
        modelAndView.addObject("financingList",financingList);
        modelAndView.setViewName("AdminReceiptList");//经理权限

        //添加日志管理信息
        Adminlog adminlog = new Adminlog();
        adminlog.setEmpId(Integer.parseInt(empId));
        adminlog.setCompanyId(employeeById.getCompanyId());
        adminlog.setLogContent("查询了收款信息");
        adminlog.setLogTime(new Date());
        int i = adminlogService.insertAdminlog(adminlog);
        logger.debug("添加了"+i+"条日志管理记录");

        logger.debug("结束--收款查询：根据公司查询所有销售单的方法");
        return modelAndView;
    }

    /**
     * @description:  审核订单：根据订单id修改订单状态
     * @param:
     * @return:
     * @author: Altman
     * @date: 2018-05-08 23:38
    **/
    @RequestMapping("/updateOrderById")
    public String updateOrderById(String empId,String orderId){
        logger.debug("开始--审核订单的方法");
        logger.debug("前台获取到的empId："+empId);
        logger.debug("前台获取到的orderId："+orderId);

        //根据订单id修改订单对象的orderType字段
        Carorder carorder = new Carorder();
        carorder.setOrderId(Integer.parseInt(orderId));
        carorder.setOrderType(MyConst.HASAUDIT);
        int updateCarorderCount = carorderService.updateNonEmptyCarorderById(carorder);
        logger.debug("修改"+ updateCarorderCount +"条数据");
        if (updateCarorderCount > 0) {
            //如果修改成功,代表审核通过,这时候财务也需要增加一笔
            Carorder carorderById = carorderService.selectCarorderById(Integer.parseInt(orderId));
            logger.debug("根据订单获取到的订单对象carorderById为：" + carorderById);
            Financing financing = new Financing();
            financing.setCompanyId(carorderById.getCompanyId());
            financing.setFinancingMoney(carorderById.getOrderTotalPrice());
            financing.setFinancingType(MyConst.SPENDING);
            int insertFinancingCount = financingService.insertFinancing(financing);
            logger.debug("财务添加"+ insertFinancingCount +"条支出数据");
            logger.debug("数据financing为："+financing);

            //添加一条库存信息
            Repertory repertory = new Repertory();
            repertory.setCarId(carorderById.getCarId());
            repertory.setCompanyId(carorderById.getCompanyId());
            repertory.setPurchasePrice(carorderById.getCar().getCarPrice()*1.2);
            repertory.setInTime(new Date());
            repertory.setRepertoryNum(carorderById.getOrderNum());
            int insertRepertoryCount = repertoryService.insertRepertory(repertory);
            logger.debug("添加"+ insertRepertoryCount +"条库存数据");
            logger.debug("数据repertory为："+repertory);

            //添加日志管理信息
            Employee employeeById = employeeService.selectEmployeeById(Integer.parseInt(empId));
            Adminlog adminlog = new Adminlog();
            adminlog.setEmpId(Integer.parseInt(empId));
            adminlog.setCompanyId(employeeById.getCompanyId());
            adminlog.setLogContent("审核通过了订单");
            adminlog.setLogTime(new Date());
            int i = adminlogService.insertAdminlog(adminlog);
            logger.debug("添加了"+i+"条日志管理记录");
        }

        //重定向到库存了
        logger.debug("结束--审核订单的方法");
        return "redirect:../order/getAllOrder.action?empId="+empId;
    }


    /** 
     * @description: 根据公司查询所有订单
     * @param:
     * @return: 
     * @author: Altman 
     * @date: 2018-05-08 17:04
    **/ 
    @RequestMapping("/getAllOrder")
    public ModelAndView getAllOrder(String empId){
        logger.debug("开始--根据公司查询所有订单的方法");

        //根据用户id查询用户，并获取到公司编号companyId
        Employee employeeById = employeeService.selectEmployeeById(Integer.parseInt(empId));
        Integer positionId = employeeById.getPositionId();
        Integer companyId = employeeById.getCompanyId();

        //根据登录用户的公司编号查询所有的
        Assist assist = new Assist();
        assist.setRequires(Assist.andEq("carorder.companyId", companyId));
        List<Carorder> carorderList = carorderService.selectCarorder(assist);
        logger.debug("根据公司查询的carorderList结果为："+carorderList);

        //创建ModelAndView用来存放数据和视图
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("emp",employeeById);
        modelAndView.addObject("carorderList",carorderList);
        modelAndView.setViewName("AdminPaymentList");//经理权限

        //添加日志管理信息
        Adminlog adminlog = new Adminlog();
        adminlog.setEmpId(Integer.parseInt(empId));
        adminlog.setCompanyId(employeeById.getCompanyId());
        adminlog.setLogContent("查询了所有的订单");
        adminlog.setLogTime(new Date());
        int i = adminlogService.insertAdminlog(adminlog);
        logger.debug("添加了"+i+"条日志管理记录");

        logger.debug("结束--根据公司查询所有订单的方法");
        return modelAndView;
    }

    /**
     * @description: 下订单
     * @param:
     * @return: insertOrder
     * @author: Altman
     * @date: 2018-05-08 12:07
    **/
    @RequestMapping("/insertOrder")
    public String insertOrder(String empId,Carorder carorder){
        logger.debug("开始--下订单的方法");
        logger.debug("前台获取到的empId："+empId);
        logger.debug("前台获取到的carorder："+carorder);

        //根据汽车id获取汽车价格
        Integer carId = carorder.getCarId();
        Car carById = carService.selectCarById(carId);
        logger.debug("后台获取的car为："+carById);
        Double carPrice = carById.getCarPrice();

        //根据前台获取的数量计算汽车总价
        Integer orderNum = carorder.getOrderNum();
        double totalPrice = carPrice * orderNum;
        carorder.setOrderTotalPrice(totalPrice);

        //添加订单
        int insertCarorderCount = carorderService.insertCarorder(carorder);
        logger.debug("添加了"+insertCarorderCount+"条数据");

        //添加日志管理信息
        Employee employeeById = employeeService.selectEmployeeById(Integer.parseInt(empId));
        Adminlog adminlog = new Adminlog();
        adminlog.setEmpId(Integer.parseInt(empId));
        adminlog.setCompanyId(employeeById.getCompanyId());
        adminlog.setLogContent("下了订单");
        adminlog.setLogTime(new Date());
        int i = adminlogService.insertAdminlog(adminlog);
        logger.debug("添加了"+i+"条日志管理记录");

        //重定向到库存了
        logger.debug("结束--下订单的方法");
        return "redirect:../repertory/getAllRepertory.action?empId="+empId;
    }

    /** 
     * @description: 根据汽车id获取汽车price
     * @param:
     * @return:
     * @author: Altman 
     * @date: 2018-05-08 10:43
    **/ 
    @RequestMapping("/getCarPriceById")
    @ResponseBody
    public Map<String, Car> getCarPriceById(String carId){
        logger.debug("开始--根据汽车id获取汽车price的方法");
        Map<String,Car> map = new HashMap<String,Car>();

        Car carById = carService.selectCarById(Integer.parseInt(carId));
        logger.debug("根据汽车id获取汽车price为：" + carById);
        map.put("carById",carById);

        logger.debug("结束--根据汽车id获取汽车price的方法");
        return map;
    }

    /**
     * @description:  汽车车系选择之后根据车系id查询所有的汽车名称
     * @param:  seriesId - 车系id
     * @return:
     * @author: Altman
     * @date: 2018-05-08 09:45
    **/
    @RequestMapping("/getAllCar")
    @ResponseBody
    public Map<String, List<Car>> getAllCar(String seriesId){
        logger.debug("开始--根据车系id查询所有的汽车名称的方法");
        Map<String,List<Car>> map = new HashMap<String,List<Car>>();

        Assist assist = new Assist();
        assist.setRequires(Assist.andEq("car.seriesId",seriesId));
        List<Car> carList = carService.selectCar(assist);
        logger.debug("根据车系id查询所有的汽车名称为：" + carList);
        map.put("carList",carList);

        logger.debug("结束--根据车系id查询所有的汽车名称的方法");
        return map;
    }

    /**
     * @description: 汽车品牌选择之后根据品牌id查询所有的汽车车系
     * @param:
     * @return: getAllCarSeries
     * @author: Altman
     * @date: 2018-05-08 09:26
    **/
    @RequestMapping("/getAllCarSeries")
    @ResponseBody
    public Map<String, List<Carseries>> getAllCarSeries(String brandId){
        logger.debug("开始--根据品牌id查询所有的汽车车系的方法");
        Map<String,List<Carseries>> map = new HashMap<String,List<Carseries>>();

        Assist assist = new Assist();
        assist.setRequires(Assist.andEq("carseries.brandId",brandId));
        List<Carseries> carseriesList = carseriesService.selectCarseries(assist);
        logger.debug("根据品牌id查询所有的汽车车系为：" + carseriesList);
        map.put("carseriesList",carseriesList);

        logger.debug("结束--根据品牌id查询所有的汽车车系的方法");
        return map;
    }

    /** 
     * @description: 初始化查询所有汽车品牌 
     * @param:
     * @return:
     * @author: Altman 
     * @date: 2018-05-08 09:02
    **/ 
    @RequestMapping("/getAllCarBrand")
    @ResponseBody
    public Map<String, List<Carbrand>> getAllCarBrand(){
        logger.debug("开始--初始化查询所有汽车品牌的方法");
        Map<String,List<Carbrand>> map = new HashMap<String,List<Carbrand>>();

        List<Carbrand> carbrandList = carbrandService.selectCarbrand(null);
        logger.debug("初始化查询所有汽车品牌为：" + carbrandList);
        map.put("carbrandList",carbrandList);

        logger.debug("结束--初始化查询所有汽车品牌的方法");
        return map;
    }
}
