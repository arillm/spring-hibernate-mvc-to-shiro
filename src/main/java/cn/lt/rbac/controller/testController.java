package cn.lt.rbac.controller;

import cn.lt.rbac.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by XRog
 * On 2/1/2017.12:36 AM
 */
@Controller
public class testController{


    @Autowired
    private TestService testService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(){
//        实际返回的是views/test.jsp ,spring-mvc.xml中配置过前后缀
        return testService.test();
    }



}
