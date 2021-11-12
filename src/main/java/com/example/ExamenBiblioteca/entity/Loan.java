package com.example.ExamenBiblioteca.entity;

public class Loan {
    private String Date;
    private String DevDate;
    private String state;
    private LoanItem item;

    public Loan(String date, String devDate, String state, LoanItem item) {
        Date = date;
        DevDate = devDate;
        this.state = state;
        this.item = item;
    }
}
