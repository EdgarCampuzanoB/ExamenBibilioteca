package com.example.ExamenBiblioteca.services;

import com.example.ExamenBiblioteca.entity.Loan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
   private List<Loan> loanList;

    public void addLoan(Loan loan){
        loanList.add(loan);
    }
}
