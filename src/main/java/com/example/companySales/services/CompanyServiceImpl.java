package com.example.companySales.services;

import com.example.companySales.dataaccess.CompanyRepository;
import com.example.companySales.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
    CompanyRepository companyRepository;
    @Override
    public Iterable<Company> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public Iterable<Company> findAllByOrderBySales() {
        return companyRepository.findAllByOrderBySales();
    }

    @Override
    public Iterable<Company> findAllBySalesGreaterThan(Integer number) {
        return companyRepository.findAllBySalesGreaterThan(number);
    }

    @Autowired
    public void setCompanyRepository(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
}
