package com.zjqiu.erp.examination.controller;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class PageController {

    private Logger logger = LoggerFactory.getLogger( this.getClass().getName() );

    @RequestMapping({"/","/index"})
    public String index(){
        logger.debug( "get in index page" );
        return "index.html";
    }

    @RequestMapping({"/login"})
    public String login(){
        logger.debug( "get in login page" );
        return "/user/login.html";
    }

}
