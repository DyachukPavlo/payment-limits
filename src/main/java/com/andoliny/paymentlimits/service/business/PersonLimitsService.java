package com.andoliny.paymentlimits.service.business;

import com.andoliny.paymentlimits.domain.PersonLimitDto;

import java.util.Set;

public interface PersonLimitsService {
    Set<PersonLimitDto> getCurrentLimits(long personId, String currency);
    Set<PersonLimitDto> createUpdateLimits(long personId, String currency);
}
