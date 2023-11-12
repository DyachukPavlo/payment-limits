package com.andoliny.paymentlimits.service.crud;

import com.andoliny.paymentlimits.model.PersonLimit;
import com.andoliny.paymentlimits.repository.PersonLimitRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Data
public class PersonLimitService {
    private final PersonLimitRepository personLimitRepository;

    public PersonLimit create(PersonLimit personLimit) {
        return personLimitRepository.save(personLimit);
    }
}
