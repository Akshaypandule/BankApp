package com.bank_project.entity;

import com.bank_project.enums.Gender;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String first_name;
    private String last_name;
    private String email_id;
    private String password;
    private Date dob;
    private String adhar_number;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Address> addresses;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<MobileNumber> mobileNumbers;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "customer_depositorAccount_relationship",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "depositor_account_id")
    )
    private List<DepositorAccount> depositorAccounts;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "customer_borrowerAccount_relationship",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "borrower_account_id")
    )
    private List<BorrowerAccount> borrowerAccounts;

}
