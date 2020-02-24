package com.lcx.controller;


import com.lcx.pojo.MemberBaseinfo;
import com.lcx.service.MemberBaseinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lcx
 * @since 2020-02-24
 */
@Controller
@RequestMapping("/memberBaseinfo")
public class MemberBaseinfoController {
    @Autowired
    private MemberBaseinfoService memberBaseinfoService;

    @ResponseBody
    @RequestMapping(value = "{id}",method = RequestMethod.GET) //memberBaseinf/1
    public MemberBaseinfo selectByParimaryKey(@PathVariable("id") final String id){
        System.out.println("获取的id值是："+id);
        System.out.println("自动注入的值是："+memberBaseinfoService);
        MemberBaseinfo memberBaseinfo=memberBaseinfoService.selectByPrimaryKey(id);
        return memberBaseinfo;
    }
}

