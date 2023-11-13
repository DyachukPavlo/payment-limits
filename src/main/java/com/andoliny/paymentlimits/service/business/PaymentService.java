package com.andoliny.paymentlimits.service.business;

import com.andoliny.paymentlimits.domain.PaymentDto;

import java.util.Date;
import java.util.List;

public interface PaymentService {
    PaymentDto createPayment(PaymentDto paymentDto);
    PaymentDto updatePaymentStatus(PaymentDto paymentDto);
    List<PaymentDto> getHistory(long personId, Date from, Date to);
}
