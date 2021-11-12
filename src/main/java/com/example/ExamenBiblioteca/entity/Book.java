package com.example.ExamenBiblioteca.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter @Setter
public class Book implements LoanItem{
    private Integer id;
    private String name;


    @Override
    public void getDevolutionDays() {
        LocalDateTime loanDate = LocalDateTime.now();
        LocalDateTime deliveryDay = loanDate.plusDays(7);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    }

    @Override
    public void getCode(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
