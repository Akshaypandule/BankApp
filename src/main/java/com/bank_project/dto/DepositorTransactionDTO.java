package com.bank_project.dto;

import com.bank_project.entity.DepositorAccount;
import com.bank_project.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepositorTransactionDTO {

    private Integer id;
    private Double amount;

    private TransactionType type;

    private DepositorAccount depositorAccount;
}
