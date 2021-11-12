package com.example.ExamenBiblioteca.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Customer {
    private String name;
    private String dni;
    private String address;
    private List<Loan> loanList;

    public Customer(String name, String dni, String address) {
        this.name = name;
        this.dni = dni;
        this.address = address;
    }



}