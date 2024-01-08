package com.bank_project.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class DepositorAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Long account_number;
    private Double balance;


    @ManyToMany(mappedBy = "depositorAccounts")
    private List<Customer> customers;

    @OneToMany(mappedBy = "depositorAccount", cascade = CascadeType.ALL)
    private List<DepositorTransaction> transactions;

    /* @ManyToOne
    private Branch branch;


     "branch" : [
        {
            "name" : "Narhe",
            "city" : "Narhe",
            "branch_code" : 555
        }
            ],*/


}
