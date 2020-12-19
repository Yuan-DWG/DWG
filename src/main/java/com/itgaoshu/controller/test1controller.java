package com.itgaoshu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test1controller {
    @RequestMapping("userlogin.do")
    public String userLogin(){
        return "login.html";
    }
}
