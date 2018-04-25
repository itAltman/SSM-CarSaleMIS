package controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Company;
import pojo.Employee;
import service.CompanyService;
import service.EmployeeService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;


/**
 * @description: 登录或注册页面控制器
 * @author: Altman
 * @date: 2018-04-22 12:00
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private static Logger logger = LogManager.getLogger();

    @Resource
    EmployeeService employeeServiceImpl;

    @RequestMapping("/isExistCompanyName")
    public @ResponseBody Map<String, String> isExistCompanyName(Company company){

        Employee employee = employeeServiceImpl.selectEmployeeById(1);
        logger.debug("公司对象：" + employee);
       /* Company companyObj = companyService.selectCompanyByObj(company);
        logger.debug("公司对象：" + companyObj);*/

        Map<String,String> map = new HashMap();
        map.put("a","bbb");
        logger.debug(map);
        return map;
    }

}
