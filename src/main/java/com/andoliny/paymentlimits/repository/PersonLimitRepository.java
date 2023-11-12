package com.andoliny.paymentlimits.repository;

import com.andoliny.paymentlimits.model.PersonLimit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonLimitRepository extends JpaRepository<PersonLimit, Long> {
}
