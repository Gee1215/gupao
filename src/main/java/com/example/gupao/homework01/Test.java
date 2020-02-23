package com.example.gupao.homework01;

import com.example.gupao.homework01.factory.AliPayPaymentFactory;
import com.example.gupao.homework01.factory.PaymentFactory;

public class Test {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new AliPayPaymentFactory();
        paymentFactory.getPaymentFactory().insidePay();
        paymentFactory.getPaymentFactory().outsidePay();
    }
}
