package com.bank_project.entity;

import com.bank_project.enums.LoanType;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class BorrowerAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Long account_number;
    private Double balance;

    @Enumerated(EnumType.STRING)
    private LoanType loan_type;

    @ManyToMany(mappedBy = "borrowerAccounts")
    private List<Customer> customers;

   /* @ManyToOne
    private Branch branch;*/


}
