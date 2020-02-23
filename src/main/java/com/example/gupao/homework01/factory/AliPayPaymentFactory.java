package com.example.gupao.homework01.factory;

import com.example.gupao.homework01.product.AliPay;

/*
* 具体工厂类
* */
public class AliPayPaymentFactory implements PaymentFactory {
    @Override
    public AliPay getPaymentFactory(){
        return  new AliPay();
    }
}
