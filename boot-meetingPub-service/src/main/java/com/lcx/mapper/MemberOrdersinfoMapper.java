package com.lcx.mapper;


import com.lcx.pojo.MemberOrdersinfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lcx
 * @since 2020-02-24
 */
@Repository
public interface MemberOrdersinfoMapper{
    @Select("select * from member_ordersinfo where membercode=#{membercode}")
    public List<MemberOrdersinfo> selectByMemberKey(@Param("membercode") final String membercode);
}
