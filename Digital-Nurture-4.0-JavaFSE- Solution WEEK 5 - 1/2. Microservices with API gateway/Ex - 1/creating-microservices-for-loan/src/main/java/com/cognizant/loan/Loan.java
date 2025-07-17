package com.cognizant.loan;

public class Loan {
    private String number;
    private String type;
    private double amount;
    private double emi;
    private int tenure;
    private double interestRate;
    private String startDate;
    private String endDate;
    private String status;

    public Loan(String number, String type, double amount, double emi, 
               int tenure, double interestRate, String startDate, 
               String endDate, String status) {
        this.number = number;
        this.type = type;
        this.amount = amount;
        this.emi = emi;
        this.tenure = tenure;
        this.interestRate = interestRate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
    public double getEmi() { return emi; }
    public void setEmi(double emi) { this.emi = emi; }
    public int getTenure() { return tenure; }
    public void setTenure(int tenure) { this.tenure = tenure; }
    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }
    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }
    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}