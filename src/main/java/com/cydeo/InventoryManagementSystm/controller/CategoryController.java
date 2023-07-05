package com.cydeo.InventoryManagementSystm.controller;

import com.cydeo.InventoryManagementSystm.dto.CategoryDto;
import com.cydeo.InventoryManagementSystm.dto.ResponseWrapper;
import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {


    @GetMapping
    public ResponseEntity<ResponseWrapper> getCategories() {
        List<CategoryDto> categoryList=
    }
}
