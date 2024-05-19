package com.metrec.backend.repos;

import com.metrec.backend.Entities.Transaction;
import com.metrec.backend.controllers.TransactionController;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, BigInteger> {
}
