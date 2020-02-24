package com.lcx.controller;


import com.lcx.pojo.MemberBaseinfo;
import com.lcx.service.MemberBaseinfoService;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.lang.reflect.Member;

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
        return memberBaseinfoService.selectByPrimaryKey(id);
    }
}

