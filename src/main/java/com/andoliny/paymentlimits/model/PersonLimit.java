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
@Table(name = "person_limit",
        uniqueConstraints = { @UniqueConstraint(name = "SingleActiveLimitTypeForPerson",
                columnNames = { "person_id", "limit_id", "active" }) })
public class PersonLimit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private long person_id;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "limit_id", referencedColumnName = "id")
    private Limit limitId;

    private BigDecimal startAmount;

    private BigDecimal spentAmount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;

    @Column(columnDefinition = "boolean default false")
    private boolean active;
}
