package com.andoliny.paymentlimits.service.business;

import com.andoliny.paymentlimits.domain.Payment;
import com.andoliny.paymentlimits.model.Transaction;

import java.util.Date;
import java.util.List;

public interface PaymentService {
    Transaction createPayment(Payment payment);
    Transaction updatePaymentStatus(Payment payment);
    List<Payment> getHistory(long personId, Date from, Date to);
}
