package com.andoliny.paymentlimits.service.business;

import com.andoliny.paymentlimits.domain.CurrencyLimitDto;


public interface CurrencyLimitsService {
    CurrencyLimitDto setUpdateLimit(CurrencyLimitDto currencyLimitDto/*BigDecimal value, String currency, String period*/);
}
