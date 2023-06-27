package com.cydeo.InventoryManagementSystm.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="categories")
public class Category extends BaseEntity{

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="company_id")

    private Company company;
}
