package com.lcx.service.impl;

import com.lcx.mapper.MemberBaseinfoMapper;
import com.lcx.pojo.MemberBaseinfo;
import com.lcx.service.MemberBaseinfoService;
import org.springframework.stereotype.Service;

@Service
public class MemberBaseinfoServiceImpl implements MemberBaseinfoService {
    private MemberBaseinfoMapper memberBaseinfoMapper;
    public MemberBaseinfo selectByPrimaryKey(String code){
        return memberBaseinfoMapper.selectByPrimaryKey(code);
    }
}
