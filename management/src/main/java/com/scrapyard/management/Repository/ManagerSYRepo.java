package com.scrapyard.management.Repository;
import com.scrapyard.management.Models.Company;
import com.scrapyard.management.Models.ManagerSY;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ManagerSYRepo extends JpaRepository<ManagerSY,Long> {


    List<ManagerSY> findByNameContainingIgnoreCase(String managerName);


}
