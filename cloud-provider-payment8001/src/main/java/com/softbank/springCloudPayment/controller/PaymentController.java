package com.softbank.springCloudPayment.controller;

import com.softbank.springCloudPayment.entities.CommonResult;
import com.softbank.springCloudPayment.entities.Payment;
import com.softbank.springCloudPayment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lcc_softbank@126.com
 * @version 2020/5/11
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("*****插入结果：" + result);
        if (result > 0) { // 创建成功
            return new CommonResult(200,"插入数据库成功",result);
        } else {
            return new CommonResult(444,"插入数据库失败",result);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果："+payment);
        if (payment!=null){  //说明有数据，能查询成功
            return new CommonResult(200,"查询成功",payment);
        } else {
            return new CommonResult(444,"没有对应记录，查询ID："+id,null);
        }
    }
}
