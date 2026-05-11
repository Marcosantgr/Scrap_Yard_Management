package com.scrapyard.management.DTO.Response.ScrapYardDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class dtoResponseId {

    private Long id;
    private String companyName;
    private String name;
    private String location;
    private boolean active;


}
