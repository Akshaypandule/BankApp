package com.bank_project.dto;

import com.bank_project.entity.Branch;
import com.bank_project.entity.Customer;
import com.bank_project.entity.DepositorTransaction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepositorAccountDTO {


    private Integer id;
    private Long account_number;
    private Double balance;


    private Branch branch;

    private List<CustomerDTO> customers;

    private List<DepositorTransaction> transactions;
}
