package com.cognizant.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    
    @Autowired
    private AccountService accountService;

    @GetMapping("/{number}")
    public Account getAccountDetails(@PathVariable String number) {
        return accountService.getAccountDetails(number);
    }

    @GetMapping
    public Map<String, Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }
}