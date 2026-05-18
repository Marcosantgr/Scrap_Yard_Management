package com.scrapyard.management.DTO.Request.CustomerDTO;
import com.scrapyard.management.Models.Enums.CustomerType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTOInsert {

    @NotBlank(message = "name is required")
    @Size(min = 2, max = 100, message = "name must be between 2 and 100 characters")
    private String name;

    @Size(max = 15)
    @NotBlank(message = "Personal ID is required")
    private String personalId;

    @NotNull(message = "Type is required")
    @Enumerated(EnumType.STRING)
    private CustomerType typeCustomer;

    @NotNull(message = "CompanyId is required")
    @Positive(message = "CompanyId must be a positive number")
    private Long companyId;

}
