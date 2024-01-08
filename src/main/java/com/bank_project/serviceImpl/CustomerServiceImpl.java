package com.bank_project.serviceImpl;

import com.bank_project.dto.AddressDTO;
import com.bank_project.dto.CustomerDTO;
import com.bank_project.dto.MobileNumberDTO;
import com.bank_project.entity.Address;
import com.bank_project.entity.Customer;
import com.bank_project.entity.MobileNumber;
import com.bank_project.repository.CustomerRepository;
import com.bank_project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository repository;

    @Override
    public CustomerDTO getCustomerById(Integer id) {
        Optional<Customer> customerOptional = repository.findById(id);

        Customer c = null;
        if(customerOptional.isPresent()){
            c = customerOptional.get();
        }

        List<Address> addresses = c.getAddresses();
        List<AddressDTO> addressDTO = addresses.stream()
                .map(a -> new AddressDTO(a.getId(), a.getStreet_address(), a.getCity(), a.getState(), a.getPincode()))
                        .collect(Collectors.toList());

        List<MobileNumber> mobileNumbers = c.getMobileNumbers();

        List<MobileNumberDTO> mobileNumberDTO = mobileNumbers.stream()
                .map(mn -> new MobileNumberDTO(mn.getId(), mn.getCountry_code(), mn.getMobile_number()))
                .collect(Collectors.toList());

        /*List<CustomerDTO> dtoList = customerOptional.stream()
                .map(c -> new CustomerDTO(c.getId(), c.getFirst_name(), c.getLast_name(), c.getEmail_id(), c.getDob(), c.getGender()))
                .collect(Collectors.toList());*/

        return new CustomerDTO(c.getId(), c.getFirst_name(), c.getLast_name(), c.getEmail_id(), c.getDob(), c.getGender(), addressDTO, mobileNumberDTO);
    }



    @Transactional
    @Override
    public String addCustomer(Customer customer) {
        repository.save(customer);
        customer.getAddresses().forEach(address -> address.setCustomer(customer));
        customer.getMobileNumbers().forEach(mobileNumber -> mobileNumber.setCustomer(customer));

        return "Customer added successfully...";
    }

    @Override
    public String updateCustomer(Integer id, Customer customer) {

        Optional<Customer> customerOptional = repository.findById(id);

        Customer customer1 = customerOptional.get();

        customer1.setFirst_name(customer.getFirst_name());
        customer1.setLast_name(customer.getLast_name());
        customer1.setEmail_id(customer.getEmail_id());
        customer1.setPassword(customer.getPassword());
        customer1.setDob(customer.getDob());
        customer1.setAdhar_number(customer.getAdhar_number());
        customer1.setGender(customer.getGender());
        customer1.setAddresses(customer.getAddresses());
        customer1.setMobileNumbers(customer.getMobileNumbers());

        repository.save(customer1);
        return "Customer details updated successfully...";
    }

    @Override
    public String deleteCustomer(Integer customerId) {
        repository.deleteById(customerId);
        return "deleted.....";
    }
}
