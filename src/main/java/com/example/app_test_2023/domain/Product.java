package com.example.app_test_2023.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(
        name = "t_product"
)
public class Product {
//    {
//        "id": 1372,
//            "productID": "10001",
//            "productName": "Test 1",
//            "amount": "1000",
//            "customerName" : "abc",
//            "status": 0,
//            "transactionDate": "2022-07-10 11:14:52",
//            "createBy" : "abc",
//            "createOn" : "2022-07-10 11:14:52"
//    },
    @Id
    private Long id;
    @Column(name = "product_id")
    private int productID;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "amount")
    private int amount;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "status")
    private boolean status;
    @Column(name = "transaction_date")
    private Date transactionDate;
    @Column(name = "create_by")
    private String createBy;
    @Column(name = "create_on")
    private Date createOn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Date createOn) {
        this.createOn = createOn;
    }
}
