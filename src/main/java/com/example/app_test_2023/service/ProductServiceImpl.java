package com.example.app_test_2023.service;

import com.example.app_test_2023.domain.Product;
import com.example.app_test_2023.domain.ProductDTO;
import com.example.app_test_2023.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<ProductDTO> getAll() {
        List<Product> list = productRepository.findAll();
        List<ProductDTO> response = new ArrayList<>();
        for (Product product : list){
            ProductDTO productDTO = new ProductDTO();
            productDTO.setProductID(product.getProductID());
            productDTO.setProductName(product.getProductName());
            productDTO.setAmount(product.getAmount());
            productDTO.setStatus(product.isStatus());
            productDTO.setCreateBy(product.getCreateBy());
            productDTO.setCreateOn(product.getCreateOn());
            productDTO.setCustomerName(product.getCustomerName());
            productDTO.setId(product.getId());
            productDTO.setTransactionDate(product.getTransactionDate());
            response.add(productDTO);
        }
        return response;
    }

    @Override
    public ProductDTO getProductByProductName(String code) {
        Product product = productRepository.findProductByCode(code);
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductID(product.getProductID());
        productDTO.setProductName(product.getProductName());
        productDTO.setAmount(product.getAmount());
        productDTO.setStatus(product.isStatus());
        productDTO.setCreateBy(product.getCreateBy());
        productDTO.setCreateOn(product.getCreateOn());
        productDTO.setCustomerName(product.getCustomerName());
        productDTO.setId(product.getId());
        productDTO.setTransactionDate(product.getTransactionDate());

        return productDTO;
    }
}
