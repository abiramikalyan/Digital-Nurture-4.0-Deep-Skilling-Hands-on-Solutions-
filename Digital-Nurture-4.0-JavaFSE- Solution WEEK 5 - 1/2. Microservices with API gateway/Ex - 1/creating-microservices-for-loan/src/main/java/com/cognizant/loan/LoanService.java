package com.cognizant.loan;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoanService {
    private static final Map<String, Loan> loans = new HashMap<>();

    static {
        loans.put("H00987987972342", new Loan(
            "H00987987972342", "car", 400000, 3258, 18,
            8.5, "2022-01-15", "2023-07-15", "active"
        ));
        loans.put("H00987987972343", new Loan(
            "H00987987972343", "home", 2500000, 22500, 15,
            7.2, "2021-05-20", "2036-05-20", "active"
        ));
        loans.put("H00987987972344", new Loan(
            "H00987987972344", "personal", 500000, 14700, 3,
            12.0, "2022-03-10", "2025-03-10", "active"
        ));
        loans.put("H00987987972345", new Loan(
            "H00987987972345", "education", 800000, 13333, 5,
            9.0, "2020-08-05", "2025-08-05", "closed"
        ));
    }

    public Loan getLoanDetails(String number) {
        return loans.getOrDefault(number, 
            new Loan(number, "not found", 0, 0, 0, 
                    0, "not found", "not found", "not found"));
    }

    public Map<String, Loan> getAllLoans() {
        return loans;
    }
}