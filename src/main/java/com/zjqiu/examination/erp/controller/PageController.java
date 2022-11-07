package com.zjqiu.examination.erp.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    private static  Logger logger = Logger.getLogger(PageController.class);

    @RequestMapping({"/","/index"})
    public String index(){
        logger.info( "get in index page" );
        return "index.html";
    }

    @RequestMapping({"/login"})
    public String login(){
        logger.info( "get in login page" );
        return "/user/login.html";
    }

}
