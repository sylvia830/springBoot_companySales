package com.example.companySales.services;

import com.example.companySales.model.Company;

public interface CompanyService {
    public Iterable<Company> findAll();
    Iterable<Company> findAllByOrderBySales();

    Iterable<Company> findAllBySalesGreaterThan(Integer number);
}
