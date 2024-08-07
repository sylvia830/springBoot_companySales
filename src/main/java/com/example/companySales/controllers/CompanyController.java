package com.example.companySales.controllers;

import com.example.companySales.model.Company;
import com.example.companySales.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

    CompanyService companyService;

    @GetMapping("/companies") public Iterable<Company> getAllCompanies() {
        return companyService.findAll();
    }

    @GetMapping("/sales") public Iterable<Company> getCompaniesBySales() {
        return companyService.findAllByOrderBySales();
    }

    @GetMapping("/largeSales/{number}") public Iterable<Company> getCompaniesWithLargeSales(@PathVariable Integer number) {
        return companyService.findAllBySalesGreaterThan(number);
    }

    @Autowired
    public void setCompanyService(CompanyService companyService) {
        this.companyService = companyService;
    }
}
