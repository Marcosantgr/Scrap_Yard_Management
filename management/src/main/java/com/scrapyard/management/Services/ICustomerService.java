package com.scrapyard.management.Services;
import com.scrapyard.management.DTO.Request.CustomerDTO.CustomerDTOInsert;
import com.scrapyard.management.DTO.Response.CustomerDTO.CustomerDTOResponse;
import com.scrapyard.management.Models.Company;
import com.scrapyard.management.Models.Customer;
import com.scrapyard.management.Models.Enums.CustomerType;
import com.scrapyard.management.Models.Invoice;

import java.util.List;

public interface ICustomerService {

List<CustomerDTOResponse> getAllCustomers();


    CustomerDTOResponse saveCustomer(CustomerDTOInsert customer);


Customer getCustomerById(Long id);
Customer searchByName(String name);

Customer updateCustomer(Customer customer, Long id);
void deleteCustomer(Long id);
List<Customer> getCustomersByCompany(Long companyId);
List<Customer> getCustomersByType(CustomerType type);
Customer getCustomerByPersonalId(String personalId);
List<Invoice> getInvoicesByCustomer(Long customerId);
long countCustomersByCompany(Long companyId);



}
