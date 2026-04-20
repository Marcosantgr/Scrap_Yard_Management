package com.scrapyard.management.Services;
import com.scrapyard.management.DTO.Request.CompanyDTORequest.CompanyDTORequestInsert;
import com.scrapyard.management.DTO.Response.CompanyDTO.CompanyDTOResponse;
import java.util.List;

public interface ICompanyService {

    List<CompanyDTOResponse> getAllCompanies();
    CompanyDTOResponse getCompanyById(Long id);
    CompanyDTOResponse getCompanyByName(String name);
    CompanyDTOResponse saveCompany(CompanyDTORequestInsert company);
    CompanyDTOResponse updateCompany(CompanyDTORequestInsert company, Long id);
    String deleteCompany(Long id);

}
