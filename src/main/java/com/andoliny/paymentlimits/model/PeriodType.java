package com.andoliny.paymentlimits.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PeriodType {
    M("Monthly"), D("Daily");

    private String description;
}
