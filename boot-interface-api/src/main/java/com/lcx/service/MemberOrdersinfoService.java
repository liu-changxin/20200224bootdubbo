package com.lcx.service;


import com.lcx.pojo.MemberOrdersinfo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lcx
 * @since 2020-02-24
 */
public interface MemberOrdersinfoService {
    public List<MemberOrdersinfo> selectByMemberKey(String membercode);
}
