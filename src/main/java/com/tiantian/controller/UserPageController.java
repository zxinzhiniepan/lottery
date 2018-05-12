package com.tiantian.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class UserPageController {
    @RequestMapping("/hello")
    public String hello(){

        return "/WEB-INF/views/hello.jsp";
    }
}
