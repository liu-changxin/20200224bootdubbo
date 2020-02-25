package com.lcx.controller;


import com.lcx.pojo.Pay;
import com.lcx.service.pay.PayService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lcx
 * @since 2020-02-24
 */
@Controller
@RequestMapping("/pay")
@Api(description= "支付接口")
public class PayController {
    @Autowired
    private PayService payService;

    @ResponseBody
    @RequestMapping(value = "{id}",method = RequestMethod.GET) //memberBaseinf/1
    @ApiOperation("根据主键查询支付数据")
    public Pay selectByParimaryKey(@PathVariable("id") final String id){
        System.out.println("获取的id值是："+id);
        System.out.println("自动注入的值是："+payService);
        Pay pay=payService.selectByMembercodeKey(id);
        return pay;
    }
}

