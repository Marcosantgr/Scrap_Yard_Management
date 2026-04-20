package com.scrapyard.management.DTO.Request.CompanyDTORequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CompanyDTORequestInsert {

    private String name;
    private String location;

}
