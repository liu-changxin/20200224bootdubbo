package com.lcx.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 会员信息表
 * </p>
 *
 * @author lcx
 * @since 2020-02-24
 */
@Data
public class MemberBaseinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code;
    private String name;
    private String gender;
    /**
     * 电话
     */
    private String phone;
    private Double totalIntegral;
    private Double consumeintegral;
    private Double interactintegral;
    private String province;
    private String city;
    private String area;
    /**
     * 注册时间
     */
    private Date registertime;
    private String upperCode;
    private String address;
    /**
     * 登陆密码
     */
    private String password;
    private String state;
    private Date currentDate;
    private Integer placeorderstimes;
    /**
     * 备注
     */
    private String remarks;
    private String openid;
    private String checkagree;
    private Double sumsalesvolume;
    private String registertimeStr;
    private Pay pay;
}
