package com.bank_project.dto;

import com.bank_project.entity.Branch;
import com.bank_project.entity.Customer;
import com.bank_project.enums.LoanType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class BorrowerAccountDTO {

    private Integer id;
    private Long account_number;
    private Double balance;

    private LoanType loanType;

    private Customer customer;

    private Branch branch;
    

}
