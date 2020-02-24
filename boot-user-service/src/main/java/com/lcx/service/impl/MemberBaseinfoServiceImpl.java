package com.lcx.service.impl;

import com.lcx.mapper.MemberBaseinfoMapper;
import com.lcx.pojo.MemberBaseinfo;
import com.lcx.service.MemberBaseinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberBaseinfoServiceImpl implements MemberBaseinfoService {
    @Autowired
    private MemberBaseinfoMapper memberBaseinfoMapper;
    public MemberBaseinfo selectByPrimaryKey(String code){
        System.out.println("获取的code值是："+code);
        System.out.println("自动注入的值是："+memberBaseinfoMapper);
        MemberBaseinfo memberBaseinfo= memberBaseinfoMapper.selectByPrimaryKey(code);


        System.out.println("查库获取的值是："+memberBaseinfo);
        return memberBaseinfo;
    }
}
