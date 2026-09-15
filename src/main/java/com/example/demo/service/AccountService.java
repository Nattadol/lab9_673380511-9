package com.example.demo.service;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    // สร้าง Account ใหม่
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }
    
    public Account getAccountById(long id) {
    	return accountRepository.findById(id)
    			.orElseThrow(() -> new RuntimeException("Account not found with id: " + id));
    }
    
    
}