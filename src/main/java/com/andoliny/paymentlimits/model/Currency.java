package com.andoliny.paymentlimits.model;

import lombok.*;

@AllArgsConstructor
@Getter
public enum Currency {
    USD(840), UAH(804);
    private final int code;
}
