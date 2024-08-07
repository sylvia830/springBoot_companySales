package com.example.companySales.dataaccess;

import com.example.companySales.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    Iterable<Company> findAllByOrderBySales();

    Iterable<Company> findAllBySalesGreaterThan(Integer number);
}
