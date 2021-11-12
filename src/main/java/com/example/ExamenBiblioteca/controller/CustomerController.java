package com.example.ExamenBiblioteca.controller;

import com.example.ExamenBiblioteca.entity.Customer;
import com.example.ExamenBiblioteca.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    private List<Customer> customerList = new LinkedList<>();

    @GetMapping
    public ArrayList<Customer> getCustomers(){
        return customerRepository.getCustomerArrayList();
    }

    @GetMapping("/{dni}")
    public ResponseEntity<Customer> getCustomers(@PathVariable String dni) throws CustomerNotExistException {
        Optional<Customer> optionalCustomer = customerRepository.findCustomer(dni);
        if (optionalCustomer.isEmpty()){
            throw new CustomerNotExistException();
        }
        return ResponseEntity.ok(optionalCustomer.get());
    }

    @PostMapping
    public void createCustomer(Customer customer){
        customerRepository.getCustomerArrayList().add(customer);
    }

    @DeleteMapping
    public void deleteCustomer(String dni){
        Optional <Customer> optionalCustomer = customerRepository.findCustomer(dni);
        optionalCustomer.ifPresent(value -> customerRepository.getCustomerArrayList().remove(value));
    }

    @PutMapping
    public void modifyCustomer(Customer customer){
        deleteCustomer(customer.getDni());

    }

}
