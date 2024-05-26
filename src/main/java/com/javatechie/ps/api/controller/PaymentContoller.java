package com.javatechie.ps.api.controller;

import com.javatechie.ps.api.entity.Payment;
import com.javatechie.ps.api.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentContoller {

    @Autowired
    private PaymentService paymentService;


    @PostMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment){
        return paymentService.doPayment(payment);
    }

    @GetMapping("/{orderId}")
    public Payment findPaymentHistoryByOrderId(int orderId){
       return paymentService.findPaymentHistoryByOrderId(orderId);
    }
}
