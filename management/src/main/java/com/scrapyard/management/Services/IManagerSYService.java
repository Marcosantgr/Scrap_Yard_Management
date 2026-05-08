package com.scrapyard.management.Services;
import com.scrapyard.management.DTO.Request.ManagerSYDTO.ManagerSYDTORequestInsert;
import com.scrapyard.management.DTO.Response.ManagerSYDTO.ManagerSYDTOResponse;
import com.scrapyard.management.Models.Company;
import com.scrapyard.management.Models.ManagerSY;
import com.scrapyard.management.Models.ScrapYard;
import java.util.List;

public interface IManagerSYService {


    List<ManagerSYDTOResponse> getAllManagers();
    ManagerSYDTOResponse getManagerSYById(Long id);
    List<ManagerSYDTOResponse> getManagerSYByName(String name);
    ManagerSYDTOResponse saveManagerSY(ManagerSYDTORequestInsert managerDTOInsert);
    ManagerSYDTOResponse updateManager(ManagerSYDTORequestInsert manager, Long id);
    String deleteManager(Long id);
    List<ManagerSYDTOResponse> getAllManagersByScrapYard(Long yardId);

}
