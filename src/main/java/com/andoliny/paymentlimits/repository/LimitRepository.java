package com.andoliny.paymentlimits.repository;

import com.andoliny.paymentlimits.model.CurrencyLimit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LimitRepository extends JpaRepository<CurrencyLimit, Long> {
}
