package com.andoliny.paymentlimits.service.business;

import com.andoliny.paymentlimits.domain.PaymentLimit;

import java.util.List;

public interface PaymentLimitsService {
    List<PaymentLimit> getCurrentLimits(long personId, String currency);
    List<PaymentLimit> createUpdateLimits(long personId, String currency);
}
