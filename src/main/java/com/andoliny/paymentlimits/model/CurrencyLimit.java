package com.andoliny.paymentlimits.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "currency_limit", uniqueConstraints = { @UniqueConstraint(name = "UniqueLimitTypePerCountry",
        columnNames = { "period_type", "currency" }) })
public class CurrencyLimit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private PeriodType period_type;

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;
}
