package com.example.gupao.homework01.product;

public class UniCardPay implements IPayment {
    public void insidePay(){
        System.out.println("银联国内支付"); }
    public void outsidePay(){
        System.out.println("银联国外支付");
    }
}
