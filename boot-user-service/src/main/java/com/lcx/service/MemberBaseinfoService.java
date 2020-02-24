package com.lcx.service;


import com.lcx.pojo.MemberBaseinfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lcx
 * @since 2020-02-24
 */
public interface MemberBaseinfoService   {
    /**
     * 根据用户code查询用户信息
     * @param code
     * @return
     */
    MemberBaseinfo selectByPrimaryKey(String code);

}
