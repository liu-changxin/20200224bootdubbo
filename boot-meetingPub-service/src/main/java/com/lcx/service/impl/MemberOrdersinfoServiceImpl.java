package com.lcx.service.impl;


import com.lcx.mapper.MemberOrdersinfoMapper;
import com.lcx.pojo.MemberBaseinfo;
import com.lcx.pojo.MemberOrdersinfo;
import com.lcx.service.MemberBaseinfoService;
import com.lcx.service.MemberOrdersinfoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lcx
 * @since 2020-02-24
 */
@Service
public class MemberOrdersinfoServiceImpl implements MemberOrdersinfoService {
    @Autowired
    private MemberOrdersinfoMapper memberOrdersinfoMapper;
    @Reference(check = false)
    private MemberBaseinfoService memberBaseinfoService;

    public List<MemberOrdersinfo> selectByMemberKey(String membercode) {
        List<MemberOrdersinfo> memberOrdersinfoList=memberOrdersinfoMapper.selectByMemberKey(membercode);
        MemberBaseinfo memberBaseinfo=memberBaseinfoService.selectByPrimaryKey(membercode);
        for(MemberOrdersinfo memberOrdersinfo:memberOrdersinfoList){
            memberOrdersinfo.setMemberBaseinfo(memberBaseinfo);
        }
        return memberOrdersinfoList;
    }
}
