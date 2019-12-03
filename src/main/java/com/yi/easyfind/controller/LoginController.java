package com.yi.easyfind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class LoginController {

//    @RequestMapping("/adminLogin")
//    public String loginPage(){
//        return "index" ;
//    }

    @RequestMapping(value = {"/index","/"})
    public String main(){
        //用户成功登录进入主页面后记录当前的时间为登陆时间。
        System.out.println("jingruyemian");
        return "index" ;
    }
}
