package com.scrapyard.management.DTO.Request.ManagerSYDTO;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ManagerSYDTORequestInsert {

    @NotBlank
    @Size(max = 150)
    private String name;

    @NotNull
    private String email;

    @NotNull
    private String phone;

    @NotNull
    private Long scrapYardId;

}
