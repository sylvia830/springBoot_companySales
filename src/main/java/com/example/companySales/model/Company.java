package com.example.companySales.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String company;

    Integer sales;

    public Company(String companyName, Integer sales) {
        this.company = companyName;
        this.sales = sales;
    }

    public Company() {
    }

    public String getCompanyName() {
        return company;
    }

    public void setCompanyName(String companyName) {
        this.company = companyName;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }
}
