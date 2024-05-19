package com.metrec.backend.services;

import com.metrec.backend.Entities.Transaction;

import java.math.BigInteger;
import java.util.List;

public interface TransactionService {

    //Create
    Transaction createTransaction(Transaction transaction);

    //Get all transactions
    List<Transaction> getAllTransactions();

    //delete Specific Transaction
    void  deleteTransaction(BigInteger id);

    //update Specific Transaction
    Transaction upDateTransaction();

}
