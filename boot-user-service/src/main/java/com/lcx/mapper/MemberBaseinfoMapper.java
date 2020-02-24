package com.lcx.mapper;


import com.lcx.pojo.MemberBaseinfo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lcx
 * @since 2020-02-24
 */
public interface MemberBaseinfoMapper {
    MemberBaseinfo selectByPrimaryKey(String code);
}
