package com.techstack.corebanking.dto;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryCustAccDetailRequest {
  private String branchcode;
  private String custacno;
}
