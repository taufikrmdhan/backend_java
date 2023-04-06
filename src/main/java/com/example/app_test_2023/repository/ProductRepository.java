package com.example.app_test_2023.repository;

import com.example.app_test_2023.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long>, JpaSpecificationExecutor<Product> {
    @Query("select t from Product t where t.productName =:code")
    Product findProductByCode(String code);
}
