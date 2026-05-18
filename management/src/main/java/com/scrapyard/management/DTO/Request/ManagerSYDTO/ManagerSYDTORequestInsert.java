package com.scrapyard.management.DTO.Request.ManagerSYDTO;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ManagerSYDTORequestInsert {

    @NotBlank(message = "Name is required")
    @Pattern(regexp = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$", message = "Only letters are allowed")
    private String name;

    @NotBlank(message = "email is required")
    @Email(message = "Invalid email format")
    @Size(min = 6, max = 100, message = "email must be between 6 and 100 characters")
    @Pattern(
            regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$",
            message = "Email must contain a valid domain"
    )
    private String email;

    @NotBlank(message = "phone is required")
    private String phone;

    @NotNull(message = "scrapYardId is required")
    @Positive(message = "scrapYardId must be a positive number")
    private Long scrapYardId;

}
