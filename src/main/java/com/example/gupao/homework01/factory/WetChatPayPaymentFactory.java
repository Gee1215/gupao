package com.example.gupao.homework01.factory;

import com.example.gupao.homework01.product.WeChatPay;

/*
* 具体工厂类
* */
public class WetChatPayPaymentFactory implements PaymentFactory {
    @Override
    public WeChatPay getPaymentFactory(){
        return  new WeChatPay();
    }
}
