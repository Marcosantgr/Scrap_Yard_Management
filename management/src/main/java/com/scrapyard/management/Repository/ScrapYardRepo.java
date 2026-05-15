package com.scrapyard.management.Repository;
import com.scrapyard.management.Models.Company;
import com.scrapyard.management.Models.ScrapYard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ScrapYardRepo extends JpaRepository<ScrapYard,Long> {


    Optional<ScrapYard> findByname(String ScrapYardName);
    boolean existsByname(String name);

    List<ScrapYard> findByNameContainingIgnoreCase(String scrapyardName);

}
