package com.bank_project.service;

import com.bank_project.dto.DepositorAccountDTO;
import com.bank_project.dto.DepositorTransactionDTO;
import com.bank_project.entity.DepositorAccount;

import javax.transaction.Transaction;
import java.util.List;

public interface DepositorAccountService {

    public String addTransactionForDepositorAccount(Long accountNo, Transaction transaction);

    public DepositorAccountDTO getDepositorAccountByAccountNumber(Long accountNo);

    public List<Transaction> getTransactionsByAccountNumber(Long accountNo);

    public String deleteTransactionsByAccountNumber(Long accountNo, Integer transactionId);


}
