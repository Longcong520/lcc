package com.softbank.springCloudPayment.service;

import com.softbank.springCloudPayment.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author lcc_softbank@126.com
 * @version 2020/5/11
 */
public interface PaymentService {

    public int create(Payment payment); //创建

    public Payment getPaymentById(@Param("id") Long id); // 读取
}
