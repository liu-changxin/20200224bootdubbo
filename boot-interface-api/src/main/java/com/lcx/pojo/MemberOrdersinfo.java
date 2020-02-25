package com.lcx.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author lcx
 * @since 2020-02-24
 */
@Data
public class MemberOrdersinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code;
    private String membercode;
    /**
     * 下单时间
     */
    private Date placeDatetime;
    /**
     * 单据状态
     */
    private String progressstate;
    private Integer agioticketserial;
    /**
     * 单据金额
     */
    private Double money;
    private String remarks;
    /**
     * 下单类型
     */
    private String placetype;
    /**
     * 挂卖单编号
     */
    private String billorderscode;
    private String address;
    private String area;
    private String city;
    private Double integralnumber;
    private String phone;
    private String province;
    private String receiverman;
    /**
     * 结算状态
     */
    private String settlementstate;
    private Integer isHandle;
    private MemberBaseinfo memberBaseinfo;
}
