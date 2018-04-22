package controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


/**
 * @description: 登录或注册页面控制器
 * @author: Altman
 * @date: 2018-04-22 12:00
 */
@Controller
@RequestMapping("user")
public class UserController {
    private static Logger logger = LogManager.getLogger();

    @RequestMapping("isExistCompanyName")
    public @ResponseBody Map<String, String> isExistCompanyName(String companyName){

        Map<String,String> map = new HashMap();
        map.put("a","bbb");
        logger.debug(map);
        return map;
    }

}
