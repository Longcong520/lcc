package com.softbank.springCloudPayment.service.impl;

import com.softbank.springCloudPayment.dao.PaymentDao;
import com.softbank.springCloudPayment.entities.Payment;
import com.softbank.springCloudPayment.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lcc_softbank@126.com
 * @version 2020/5/11
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
