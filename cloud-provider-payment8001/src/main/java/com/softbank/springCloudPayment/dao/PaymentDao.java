package com.softbank.springCloudPayment.dao;

import com.softbank.springCloudPayment.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author lcc_softbank@126.com
 * @version 2020/5/11
 */
@Mapper
public interface PaymentDao {

    /**
     * 新增
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);
}
