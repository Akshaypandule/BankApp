package com.bank_project.dto;

import com.bank_project.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MobileNumberDTO {


    private Integer id;
    private String country_code;
    private String mobile_number;


}
