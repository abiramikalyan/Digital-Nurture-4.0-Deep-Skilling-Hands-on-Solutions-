package com.cognizant.account;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AccountService {
    private static final Map<String, Account> accounts = new HashMap<>();

    static {
        accounts.put("00987987973432", new Account(
            "00987987973432", "savings", 234343.0, 
            "Main Branch", "CBIN0283948", "2020-05-15", "active"
        ));
        accounts.put("00987987973433", new Account(
            "00987987973433", "current", 500000.0, 
            "Downtown Branch", "CBIN0283949", "2019-11-22", "active"
        ));
        accounts.put("00987987973434", new Account(
            "00987987973434", "salary", 120000.0, 
            "Tech Park Branch", "CBIN0283950", "2021-02-10", "active"
        ));
        accounts.put("00987987973435", new Account(
            "00987987973435", "fixed", 1000000.0, 
            "Main Branch", "CBIN0283948", "2018-07-30", "matured"
        ));
    }

    public Account getAccountDetails(String number) {
        return accounts.getOrDefault(number, 
            new Account(number, "not found", 0.0, 
                       "not found", "not found", "not found", "not found"));
    }

    public Map<String, Account> getAllAccounts() {
        return accounts;
    }
}