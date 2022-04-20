package com.example.Bill_Project.controller;

import com.example.Bill_Project.entity.ProductType;
import com.example.Bill_Project.service.ProductTypeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("productType")
public class ProductTypeController {
    @Autowired
    private final ProductTypeService productTypeService;

    @PostMapping()
    public ProductType addNewProductType(@RequestBody ProductType productType) {
        return productTypeService.saveProductType(productType);
    }

    @PutMapping()
    public ProductType updateProductType(@RequestBody ProductType productType) {
        return productTypeService.updateProductType(productType);
    }

    @GetMapping()
    public List<ProductType> getProductType() {
        return productTypeService.getProductType();
    }

    @DeleteMapping("/{id}")
    public String deleteProductType(@PathVariable int id) {
        return productTypeService.DeleteProductType(id);
    }
}
