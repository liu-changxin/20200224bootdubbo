package com.lcx.mapper;


import com.lcx.pojo.Pay;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lcx
 * @since 2020-02-24
 */
@Repository
public interface PayMapper {
    @Select("select * from member_paymentinfo where membercode=#{membercode}")
    public Pay selectByMembercodeKey(@Param("membercode") String membercode);
    @Select("select * from member_baseinfo where code=#{membercode}")
    public List<Map<String,String>> selectByMembercodeId(@Param("membercode") String membercode);
}
