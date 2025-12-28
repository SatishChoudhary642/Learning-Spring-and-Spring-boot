package com.satish.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    
    private Logger logger = LoggerFactory.getLogger(getClass());

    //http://localhost:8081/login?name=Satish
    @RequestMapping("login")
    public String gottoLoginPage(@RequestParam String name, ModelMap model){
        model.put("nameVar", name);
        logger.debug("Will only be printed if level is set to debug");
        logger.info("Request param is {}",name);
        logger.warn("Printed on warn level");
        return "login";
    }
}
