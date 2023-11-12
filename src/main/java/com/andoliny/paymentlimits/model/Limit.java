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
@Table(name = "limits", uniqueConstraints = { @UniqueConstraint(name = "UniqueLimitTypePerCountry",
        columnNames = { "period_type", "currency" }) })
public class Limit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String period_type;

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;
}
