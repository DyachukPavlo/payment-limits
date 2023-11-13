package com.andoliny.paymentlimits.service.crud;

import com.andoliny.paymentlimits.model.CurrencyLimit;
import com.andoliny.paymentlimits.repository.LimitRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Data
@Service
public class LimitService {
    private final LimitRepository limitRepository;

    public CurrencyLimit create(CurrencyLimit currencyLimit) {
        return limitRepository.save(currencyLimit);
    }
}
