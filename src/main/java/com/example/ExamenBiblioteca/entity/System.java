package com.example.ExamenBiblioteca.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class System {
    private List<Loan> loanList;
    private List<Customer> customerList;
    private List<LoanItem> items;

}
