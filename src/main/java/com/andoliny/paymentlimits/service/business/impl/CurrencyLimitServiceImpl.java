package com.andoliny.paymentlimits.service.business.impl;

import com.andoliny.paymentlimits.domain.CurrencyLimitDto;
import com.andoliny.paymentlimits.service.business.CurrencyLimitsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CurrencyLimitServiceImpl implements CurrencyLimitsService {
    @Override
    public CurrencyLimitDto setUpdateLimit(CurrencyLimitDto currencyLimitDto) {
        return null;
    }
}
