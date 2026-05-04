package com.scrapyard.management.Services;
import com.scrapyard.management.DTO.Request.CompanyDTORequest.CompanyDTORequestInsert;
import com.scrapyard.management.DTO.Response.CompanyDTO.CompanyDTOResponse;
import com.scrapyard.management.DTO.Response.ContainerDTO.ContainerDTOResponse;
import com.scrapyard.management.DTO.Response.CustomerDTO.CustomerDTOResponse;
import com.scrapyard.management.DTO.Response.ScrapYardDTO.ScrapYardDTOResponse;

import java.util.List;

public interface ICompanyService {

    List<CompanyDTOResponse> getAllCompanies();
    CompanyDTOResponse getCompanyById(Long id);
    List<CompanyDTOResponse> getCompanyByName(String name);
    CompanyDTOResponse saveCompany(CompanyDTORequestInsert company);
    CompanyDTOResponse updateCompany(CompanyDTORequestInsert company, Long id);
    String deleteCompany(Long id);
    List<ScrapYardDTOResponse> getAllYards(Long companyId);
    List<CustomerDTOResponse> getAllCustomers(Long companyId);

}
