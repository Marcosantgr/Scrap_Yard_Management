package com.scrapyard.management.DTO.Response.ManagerSYDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ManagerSYDTOResponse {

    private String name;
    private String email;
    private String phone;
    private String scrapYardName;


}
