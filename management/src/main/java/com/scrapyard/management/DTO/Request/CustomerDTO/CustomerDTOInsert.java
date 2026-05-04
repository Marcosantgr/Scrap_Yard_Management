package com.scrapyard.management.DTO.Request.CustomerDTO;
import com.scrapyard.management.Models.Enums.CustomerType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTOInsert {

    @NotBlank
    @Size(max = 150)
    private String name;

    @NotNull
    private String personalId;

    @NotNull
    private CustomerType typeCustomer;

    @NotNull
    private Long companyId;

}
