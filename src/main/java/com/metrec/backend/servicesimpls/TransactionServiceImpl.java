package com.metrec.backend.servicesimpls;

import com.metrec.backend.Entities.Transaction;
import com.metrec.backend.repos.TransactionRepo;
import com.metrec.backend.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {


    TransactionRepo transactionRepo;
    @Override
    public Transaction createTransaction(Transaction transaction) {
        return transactionRepo.save(transaction);
    }

    @Override
    public List<Transaction> getEmployees() {
        return null;
    }

    @Override
    public void deleteTransaction(BigInteger id) {

    }

    @Override
    public Transaction upDateTransaction() {
        return null;
    }


}
