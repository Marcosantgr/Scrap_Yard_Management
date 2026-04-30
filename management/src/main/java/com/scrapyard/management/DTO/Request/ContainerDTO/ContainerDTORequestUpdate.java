package com.scrapyard.management.DTO.Request.ContainerDTO;
import com.scrapyard.management.Models.Enums.MaterialType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContainerDTORequestUpdate {

    private String description;
    private MaterialType materialType;

}
