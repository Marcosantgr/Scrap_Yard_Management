package com.scrapyard.management.Repository;
import com.scrapyard.management.DTO.Response.CustomerDTO.CustomerDTOResponse;
import com.scrapyard.management.Models.Company;
import com.scrapyard.management.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface CustomerRepo extends JpaRepository<Customer,Long> {

    Optional<Customer> findByname(String name);

    List<Customer> findByNameContainingIgnoreCase(String customerName);


}
