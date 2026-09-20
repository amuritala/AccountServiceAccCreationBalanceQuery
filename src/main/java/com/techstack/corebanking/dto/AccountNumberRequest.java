package com.techstack.corebanking.dto;

import jakarta.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountNumberRequest {

    @NotNull(message = "Account number cannot be Empty")
    private String custacno;


}
