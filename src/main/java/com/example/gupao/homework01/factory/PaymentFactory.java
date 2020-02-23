package com.example.gupao.homework01.factory;

import com.example.gupao.homework01.product.IPayment;

/**
* 抽象工厂
* */
public interface PaymentFactory {
    IPayment getPaymentFactory();
}
