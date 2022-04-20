package com.example.Bill_Project.service;

import com.example.Bill_Project.entity.ProductType;
import com.example.Bill_Project.repository.ProductTypeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServlet;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ProductTypeService {
    @Autowired
    private final ProductTypeRepository productTypeRepository;
    //////Save product type///////
    public ProductType saveProductType(ProductType productType) {
        log.info("Saving new product type", productType);
        return productTypeRepository.save(productType);
    }
    //////Get product type///////
    public List<ProductType> getProductType() {
        log.info("Get a list of product type");
        return productTypeRepository.findAll();
    }

    //////Update product type////
    public ProductType updateProductType(ProductType productType) {
        log.info("Update the product type: {}", productType.getPdt_name());
        ProductType existingProductType = productTypeRepository.findById(productType.getPdt_id()).orElse(null);
        existingProductType.setPdt_name(productType.getPdt_name());
        return productTypeRepository.save(existingProductType);
    }

    ////Delete product type////
    public String DeleteProductType(int id) {
        log.info("Delete the product type {}", id);
        productTypeRepository.deleteById(id);
        return "Product Type have deleted: " + id;
    }
}
