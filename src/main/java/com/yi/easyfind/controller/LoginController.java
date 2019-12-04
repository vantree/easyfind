package com.yi.easyfind.controller;

import com.yi.easyfind.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class LoginController {

//    @RequestMapping("/adminLogin")
//    public String loginPage(){
//        return "index" ;
//    }
    @Autowired
    SysUserService sysUserService;

    @RequestMapping("test")
    @ResponseBody
    public String showUsers(){
        System.out.println("数据库测试显示所有用户");
        return sysUserService.list().toString();
    }

    @RequestMapping(value = {"/index","/"})
    public String main(){
        System.out.println("进入页面");
        return "index" ;
    }
}
