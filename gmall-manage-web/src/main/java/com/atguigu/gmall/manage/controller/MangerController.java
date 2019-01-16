package com.atguigu.gmall.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MangerController {

    @RequestMapping("index")
    public String index(){

        return "index";
    }


    @RequestMapping("attrlistpage")
    public String attrListPage(){

        return "attrListPage";
    }
}
