package com.controller;

import com.pojo.Company;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.CompanyService;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 用户登录和注册
 * @author: Altman
 * @date: 2018-04-26 10:05
 */
@Controller
@RequestMapping("user")
public class UserController {

    private static Logger logger = LogManager.getLogger();

    @Autowired
    CompanyService companyService;

    /**
     * @description: 根据公司姓名查询
     * @param:
     * @return:
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

}
