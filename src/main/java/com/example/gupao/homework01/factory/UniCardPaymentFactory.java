package com.example.gupao.homework01.factory;

import com.example.gupao.homework01.product.UniCardPay;

/*
* 具体工厂类
* */
public class UniCardPaymentFactory implements PaymentFactory {
    @Override
    public UniCardPay getPaymentFactory(){
        return  new UniCardPay();
    }
}
