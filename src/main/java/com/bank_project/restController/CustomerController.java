package com.bank_project.restController;

import com.bank_project.dto.CustomerDTO;
import com.bank_project.entity.Customer;
import com.bank_project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService service;

    @GetMapping("/api/v1/customers/{id}")
    public CustomerDTO getCustomerById(@PathVariable Integer id){

        return service.getCustomerById(id);
    }
    
    @PostMapping("/api/v1/customers")
    public String addCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);

        return "customer details inserted successfully...";
    }

    @PutMapping("/api/v1/customers/{id}")
    public String updateCustomer(@PathVariable Integer id, @RequestBody Customer customer){
        service.updateCustomer(id, customer);

        return "customer details updated successfully...";
    }

    @DeleteMapping("/api/v1/customers/{id}")
    public String deleteCustomer(@PathVariable Integer id){
        service.deleteCustomer(id);

        return "Customer details deleted....";

    }
}
