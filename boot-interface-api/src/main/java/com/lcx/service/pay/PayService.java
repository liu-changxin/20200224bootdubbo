package com.lcx.service.pay;

import com.lcx.pojo.Pay;

import java.util.List;

public interface PayService {
    public Pay selectByMembercodeKey(String membercode);
}
