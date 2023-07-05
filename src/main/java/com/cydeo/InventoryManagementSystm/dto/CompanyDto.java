package com.cydeo.InventoryManagementSystm.dto;

import com.cydeo.InventoryManagementSystm.enums.CompanyStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(access=AccessLevel.PUBLIC)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyDto {

    private Long id;
    private String title;
    private String website;
    private AddressDto address;
    private CompanyStatus companyStatus;
}
