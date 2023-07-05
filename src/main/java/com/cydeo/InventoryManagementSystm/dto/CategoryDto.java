package com.cydeo.InventoryManagementSystm.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryDto {

    private long id;
    private String description;

    private CompanyDto companyDto;
    private boolean hasProduct;
}
