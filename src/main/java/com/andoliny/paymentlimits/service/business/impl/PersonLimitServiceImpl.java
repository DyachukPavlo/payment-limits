package com.andoliny.paymentlimits.service.business.impl;

import com.andoliny.paymentlimits.domain.PersonLimitDto;
import com.andoliny.paymentlimits.service.business.PersonLimitsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Slf4j
@RequiredArgsConstructor
public class PersonLimitServiceImpl implements PersonLimitsService {
    @Override
    public Set<PersonLimitDto> getCurrentLimits(long personId, String currency) {
        return null;
    }

    @Override
    public Set<PersonLimitDto> createUpdateLimits(long personId, String currency) {
        return null;
    }
}
