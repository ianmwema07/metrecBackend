package com.metrec.backend.controllers;


import com.metrec.backend.Entities.Transaction;
import com.metrec.backend.services.TransactionService;
import com.metrec.backend.servicesimpls.TransactionServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/api/transaction")
public class TransactionController {
    Logger logger = LoggerFactory.getLogger(TransactionController.class);

    @Autowired
    TransactionService transactionService;
    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction){
        logger.info("Adding a transaction");


        try {
            transaction.setDateTime(LocalDateTime.now());
            Transaction transaction1 = transactionService.createTransaction(transaction);
            ResponseEntity<Transaction> responseEntity = new ResponseEntity<>(transaction1, HttpStatus.OK);
            logger.info("Transaction added successfully");
            return responseEntity;
        } catch (Exception e){
            logger.error("Create transaction exception :: " + e.getMessage());
            return new ResponseEntity<Transaction>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/allTransactions")
    ResponseEntity<List<Transaction>> getAllTransactions(){
        logger.info("all transactions endpoint");

        try {
            logger.info("all transactions");
            List<Transaction> allTransactions = transactionService.getAllTransactions();
            return new ResponseEntity<>(allTransactions, HttpStatus.OK);
        } catch (Exception e){
            logger.error("Exception occured " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}
