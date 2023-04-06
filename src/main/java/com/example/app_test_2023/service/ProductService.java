package com.example.app_test_2023.service;

import com.example.app_test_2023.domain.Product;
import com.example.app_test_2023.domain.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getAll();
    ProductDTO getProductByProductName(String code);

}
