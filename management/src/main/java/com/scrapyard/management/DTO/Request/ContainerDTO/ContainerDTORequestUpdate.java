package com.scrapyard.management.DTO.Request.ContainerDTO;
import com.scrapyard.management.Models.Enums.MaterialType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContainerDTORequestUpdate {



    @Pattern(regexp = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$", message = "Only letters are allowed")
    private String description;

    private MaterialType materialType;

}
