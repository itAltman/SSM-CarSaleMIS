package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: 测试SpringMvc是否配置成功
 * @author: Altman
 * @date: 2018-04-13 20:51
 */
@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("t")
    public String test(){
        return "test";
    }
}
