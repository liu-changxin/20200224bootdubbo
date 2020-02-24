package com.lcx.mapper;


import com.lcx.pojo.MemberBaseinfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lcx
 * @since 2020-02-24
 */
@Repository
public interface MemberBaseinfoMapper {
    @Select("select * from member_baseinfo where code=#{code}")
    public MemberBaseinfo selectByPrimaryKey(@Param("code")String code);
}
