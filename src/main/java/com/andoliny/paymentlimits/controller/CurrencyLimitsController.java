package com.andoliny.paymentlimits.controller;

import com.andoliny.paymentlimits.domain.CurrencyLimitDto;
import com.andoliny.paymentlimits.service.business.CurrencyLimitsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/currency")
public class CurrencyLimitsController {
    private final CurrencyLimitsService currencyLimitsService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<CurrencyLimitDto> crateLimit(@RequestBody CurrencyLimitDto currencyLimitDto) {
        return ResponseEntity.ok(currencyLimitsService.setUpdateLimit(currencyLimitDto));
    }
}
