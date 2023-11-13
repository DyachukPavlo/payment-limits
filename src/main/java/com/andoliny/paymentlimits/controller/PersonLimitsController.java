package com.andoliny.paymentlimits.controller;

import com.andoliny.paymentlimits.domain.PersonLimitDto;
import com.andoliny.paymentlimits.service.business.PersonLimitsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(value = "/person-limits")
public class PersonLimitsController {
    private final PersonLimitsService personLimitsService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Set<PersonLimitDto>> getActiveLimits(@RequestParam long personId, @RequestParam String currency) {
        return ResponseEntity.ok(personLimitsService.getCurrentLimits(personId, currency));
    }
}
