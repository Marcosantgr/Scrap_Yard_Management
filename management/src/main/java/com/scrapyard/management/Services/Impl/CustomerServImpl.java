package com.scrapyard.management.Services.Impl;
import com.scrapyard.management.DTO.Request.CustomerDTO.CustomerDTOInsert;
import com.scrapyard.management.DTO.Response.CompanyDTO.CompanyDTOResponse;
import com.scrapyard.management.DTO.Response.CustomerDTO.CustomerDTOResponse;
import com.scrapyard.management.Models.Company;
import com.scrapyard.management.Models.Customer;
import com.scrapyard.management.Models.Enums.CustomerType;
import com.scrapyard.management.Models.Invoice;
import com.scrapyard.management.Repository.CompanyRepo;
import com.scrapyard.management.Repository.CustomerRepo;
import com.scrapyard.management.Services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServImpl implements ICustomerService {

    @Autowired
    private final CustomerRepo customerRepo;

    @Autowired
    private final CompanyRepo companyRepo;


    public CustomerServImpl(CustomerRepo customerRepo, CompanyRepo companyRepo) {
        this.customerRepo = customerRepo;
        this.companyRepo = companyRepo;
    }


    @Override
    public List<CustomerDTOResponse> getAllCustomers() {

        if (customerRepo.findAll().isEmpty()) {
            throw new IllegalArgumentException("There are no registered customers");
        }

        return customerRepo.findAll().stream().map(customer ->
                new CustomerDTOResponse(customer.getId(), customer.getName(), customer.getPersonalId()
                ,customer.getTypeCustomer(),customer.getCompany().getName())).toList();

    }

    @Override
    public CustomerDTOResponse saveCustomer(CustomerDTOInsert customerDTOInsert) {

        if (customerDTOInsert.getName() == null || customerDTOInsert.getName().isBlank() ||
                customerDTOInsert.getPersonalId() == null ||
                customerDTOInsert.getTypeCustomer() == null ||
                customerDTOInsert.getCompanyId() == null) {
            throw new IllegalArgumentException("There cannot be blank fields");
        }

        Company company = companyRepo.findById(customerDTOInsert.getCompanyId()).orElseThrow(() ->
                new IllegalArgumentException("The company does not exist"));

        Customer customerEntity = new Customer();

        customerEntity.setName(customerDTOInsert.getName());
        customerEntity.setPersonalId(customerDTOInsert.getPersonalId());
        customerEntity.setTypeCustomer(customerDTOInsert.getTypeCustomer());
        customerEntity.setCompany(company);

        Customer saved =  customerRepo.save(customerEntity);

        return new CustomerDTOResponse(saved.getId(), saved.getName(), saved.getPersonalId(), saved.getTypeCustomer()
        , saved.getCompany().getName());
    }










    @Override
    public Customer getCustomerById(Long id) {
        return null;
    }

    @Override
    public Customer searchByName(String name) {
        return null;
    }


    @Override
    public Customer updateCustomer(Customer customer, Long id) {
        return null;
    }

    @Override
    public void deleteCustomer(Long id) {

    }

    @Override
    public List<Customer> getCustomersByCompany(Long companyId) {
        return List.of();
    }

    @Override
    public List<Customer> getCustomersByType(CustomerType type) {
        return List.of();
    }

    @Override
    public Customer getCustomerByPersonalId(String personalId) {
        return null;
    }

    @Override
    public List<Invoice> getInvoicesByCustomer(Long customerId) {
        return List.of();
    }

    @Override
    public long countCustomersByCompany(Long companyId) {
        return 0;
    }
}
