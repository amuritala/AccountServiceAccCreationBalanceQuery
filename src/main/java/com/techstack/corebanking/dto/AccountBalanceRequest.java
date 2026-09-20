package com.techstack.corebanking.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountBalanceRequest {

    @NotBlank(message = "Branch Code cannot be empty")
    private String branchCode;
    //private String BRANCH_CODE;

    @NotNull(message = "Account number cannot be Empty")
    private String custacno;
    //private String CUST_AC_NO;

}
