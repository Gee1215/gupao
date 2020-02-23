package com.example.gupao.homework01.product;

public class AliPay implements IPayment {
    public void insidePay(){
        System.out.println("阿里国内支付");
    }
    public void outsidePay(){
        System.out.println("阿里国外支付");
    }
}
