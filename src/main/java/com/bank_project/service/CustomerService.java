package com.bank_project.service;

import com.bank_project.dto.CustomerDTO;
import com.bank_project.entity.Customer;

import java.util.List;

public interface CustomerService {

    public CustomerDTO getCustomerById(Integer id);

    public String addCustomer(Customer customer);

    public String updateCustomer(Integer id, Customer customer);

    public String deleteCustomer(Integer customerId);
}
