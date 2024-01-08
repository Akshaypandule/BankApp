package com.bank_project.serviceImpl;

import com.bank_project.dto.DepositorAccountDTO;
import com.bank_project.entity.DepositorAccount;
import com.bank_project.repository.DepositorAccountRepository;
import com.bank_project.service.DepositorAccountService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transaction;
import java.util.List;

public class DepositorAccountServiceImpl implements DepositorAccountService {
    
    @Autowired
    DepositorAccountRepository repository;
    @Override
    public String addTransactionForDepositorAccount(Long accountNo, Transaction transaction)
    {
        return null;
    }
    @Override
    public DepositorAccountDTO getDepositorAccountByAccountNumber(Long accountNo)
    {
        return null;
    }

    @Override
    public List<Transaction> getTransactionsByAccountNumber(Long accountNo) {
        return null;
    }

    @Override
    public String deleteTransactionsByAccountNumber(Long accountNo, Integer transactionId) {
        return null;
    }
}
