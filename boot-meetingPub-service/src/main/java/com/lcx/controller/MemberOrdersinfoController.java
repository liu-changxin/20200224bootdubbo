package com.lcx.controller;


import com.lcx.pojo.MemberOrdersinfo;
import com.lcx.service.MemberOrdersinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lcx
 * @since 2020-02-24
 */
@Controller
@RequestMapping("/memberOrderinfo")
public class MemberOrdersinfoController {
    @Autowired
    private MemberOrdersinfoService memberOrdersinfoService;

    @ResponseBody
    @RequestMapping(value = "{membercode}",method = RequestMethod.GET)
    public List<MemberOrdersinfo> selectByMemberKey(@PathVariable("membercode") final  String membercode){
        return memberOrdersinfoService.selectByMemberKey(membercode);
    }
}

