package com.andoliny.paymentlimits.service.crud;

import com.andoliny.paymentlimits.model.Transaction;
import com.andoliny.paymentlimits.repository.TransactionRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Data
public class TransactionService {
    private final TransactionRepository transactionRepository;

    public Transaction create(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
