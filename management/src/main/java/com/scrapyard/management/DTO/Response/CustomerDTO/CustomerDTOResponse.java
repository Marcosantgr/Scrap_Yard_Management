package com.scrapyard.management.DTO.Response.CustomerDTO;
import com.scrapyard.management.Models.Enums.CustomerType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTOResponse {

    private Long id;
    private String name;
    private String personalId;
    private CustomerType typeCustomer;
    private String companyName;

}
