package com.cognizant.account;

public class Account {
    private String number;
    private String type;
    private double balance;
    private String branch;
    private String ifsc;
    private String openingDate;
    private String status;


    public Account(String number, String type, double balance, String branch, 
                  String ifsc, String openingDate, String status) {
        this.number = number;
        this.type = type;
        this.balance = balance;
        this.branch = branch;
        this.ifsc = ifsc;
        this.openingDate = openingDate;
        this.status = status;
    }

   
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
    public String getBranch() { return branch; }
    public void setBranch(String branch) { this.branch = branch; }
    public String getIfsc() { return ifsc; }
    public void setIfsc(String ifsc) { this.ifsc = ifsc; }
    public String getOpeningDate() { return openingDate; }
    public void setOpeningDate(String openingDate) { this.openingDate = openingDate; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}