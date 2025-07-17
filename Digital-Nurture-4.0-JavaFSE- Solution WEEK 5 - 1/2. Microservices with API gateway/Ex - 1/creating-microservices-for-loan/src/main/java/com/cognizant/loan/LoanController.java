package com.cognizant.loan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/loans")
public class LoanController {
    
    @Autowired
    private LoanService loanService;

    @GetMapping("/{number}")
    public Loan getLoanDetails(@PathVariable String number) {
        return loanService.getLoanDetails(number);
    }

    @GetMapping
    public Map<String, Loan> getAllLoans() {
        return loanService.getAllLoans();
    }
}