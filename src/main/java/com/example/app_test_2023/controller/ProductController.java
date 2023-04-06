package com.example.app_test_2023.controller;

import com.example.app_test_2023.domain.Product;
import com.example.app_test_2023.domain.ProductDTO;
import com.example.app_test_2023.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("product/get")
    public List<ProductDTO> getAllProduct(){
        return productService.getAll();
    }

    @GetMapping("product/getCode")
    public ProductDTO getProductByCode(@RequestParam(name = "code")String code){
        return productService.getProductByProductName(code);
    }
}
