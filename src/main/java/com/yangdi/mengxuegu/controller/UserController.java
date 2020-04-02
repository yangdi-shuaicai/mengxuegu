package com.yangdi.mengxuegu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @ResponseBody
    @RequestMapping("/lala")
    public String ceshi1()
    {
        return "测试代码吗";
    }

    @ResponseBody
    @RequestMapping("/la")
    public String ceshi2()
    {
        return "测试代码2";
    }

}
