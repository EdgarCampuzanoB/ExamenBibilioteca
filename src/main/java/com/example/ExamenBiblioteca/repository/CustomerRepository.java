package com.example.ExamenBiblioteca.repository;

import com.example.ExamenBiblioteca.entity.Customer;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;

@Component
@Getter @Setter
public class CustomerRepository {
    private ArrayList<Customer> customerArrayList = new ArrayList<>();

    public Optional<Customer> findCustomer(String dni){
        return customerArrayList.stream()
                .filter(customer -> customer.getDni().equalsIgnoreCase(dni)).findFirst();
    }
}
