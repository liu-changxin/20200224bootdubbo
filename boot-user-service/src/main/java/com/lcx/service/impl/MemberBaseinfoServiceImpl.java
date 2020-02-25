package com.lcx.service.impl;

import com.lcx.mapper.MemberBaseinfoMapper;
import com.lcx.pojo.MemberBaseinfo;
import com.lcx.pojo.Pay;
import com.lcx.service.MemberBaseinfoService;
import com.lcx.service.pay.PayService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@org.apache.dubbo.config.annotation.Service
public class MemberBaseinfoServiceImpl implements MemberBaseinfoService {
    @Autowired
    private MemberBaseinfoMapper memberBaseinfoMapper;
    @Reference(check = false)
    private PayService payService;
    public MemberBaseinfo selectByPrimaryKey(String code){
        System.out.println("获取的code值是："+code);
        System.out.println("自动注入的值是："+memberBaseinfoMapper);
        Pay pay=payService.selectByMembercodeKey(code);
        MemberBaseinfo memberBaseinfo= memberBaseinfoMapper.selectByPrimaryKey(code);
        memberBaseinfo.setPay(pay);

        System.out.println("查库获取的值是："+memberBaseinfo);
        return memberBaseinfo;
    }
}
