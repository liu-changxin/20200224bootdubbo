package com.lcx.service.impl;

import com.lcx.mapper.PayMapper;
import com.lcx.pojo.Pay;
import com.lcx.service.pay.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
@org.apache.dubbo.config.annotation.Service
public class PayServiceImpl implements PayService {
    @Autowired
    private PayMapper payMapper;
    @Override
    public Pay selectByMembercodeKey(String membercode) {
        //payMapper.selectByMembercodeKey(membercode);
        System.out.println("获取的membercode数据是："+membercode);
        List<Map<String,String>> payMentList=payMapper.selectByMembercodeId(membercode);
        System.out.println("获取的数据是："+payMentList);
        Pay pay=new Pay();
        pay.setMoney(122222222L);
        return pay;
    }
}
