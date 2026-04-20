package com.scrapyard.management.Repository;
import com.scrapyard.management.Models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CompanyRepo extends JpaRepository<Company, Long> {


    Optional<Company> findByname(String companyName);
    boolean existsByname(String name);






}
