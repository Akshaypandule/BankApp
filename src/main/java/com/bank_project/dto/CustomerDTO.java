package com.bank_project.dto;

import com.bank_project.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {


    private Integer id;
    private String first_name;
    private String last_name;
    private String email_id;
    //private String password;
    private Date dob;
    //private String adhar_number;
    private Gender gender;


    private List<AddressDTO> addresses;

    private List<MobileNumberDTO> mobileNumbers;

}
