package com.andoliny.paymentlimits.service.business.impl;

import com.andoliny.paymentlimits.domain.PaymentDto;
import com.andoliny.paymentlimits.service.business.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    @Override
    public PaymentDto createPayment(PaymentDto paymentDto) {
        return null;
    }

    @Override
    public PaymentDto updatePaymentStatus(PaymentDto paymentDto) {
        return null;
    }

    @Override
    public List<PaymentDto> getHistory(long personId, Date from, Date to) {
        return null;
    }
}
