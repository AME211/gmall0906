package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.BaseCatalog1;
import com.atguigu.gmall.bean.BaseCatalog2;
import com.atguigu.gmall.bean.BaseCatalog3;
import com.atguigu.gmall.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AttrController {
    @Reference
    AttrService attrService;
    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<BaseCatalog1> getBaseCatalog1(){
        List<BaseCatalog1> baseCatalog1s =attrService.getCatalog1();
        return baseCatalog1s;
    }

    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<BaseCatalog2>getCatalog2(String catalog1Id){
        List<BaseCatalog2>baseCatalog2s=attrService.getCatalog2(catalog1Id);
        return baseCatalog2s;
    }

    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<BaseCatalog3> getCatalog3(String catalog2Id){
        List<BaseCatalog3>baseCatalog3s=attrService.getCatalog3(catalog2Id);
        return baseCatalog3s;
    }
}
