package com.example.gupao.homework01.product;

public class WeChatPay implements IPayment {
    public void insidePay(){
        System.out.println("微信国内支付");
    }
    public void outsidePay(){
        System.out.println("微信国外支付");
    }
}
