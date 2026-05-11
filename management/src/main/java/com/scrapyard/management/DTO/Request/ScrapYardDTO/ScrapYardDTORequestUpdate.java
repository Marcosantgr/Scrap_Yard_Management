package com.scrapyard.management.DTO.Request.ScrapYardDTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ScrapYardDTORequestUpdate {

    private String name;
    private String location;
    private boolean active = true;

}
