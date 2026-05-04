package com.scrapyard.management.Controllers;
import com.scrapyard.management.DTO.Request.CustomerDTO.CustomerDTOInsert;
import com.scrapyard.management.Services.Impl.CustomerServImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {


    @Autowired
    private final CustomerServImpl customerServices;


    public CustomerController(CustomerServImpl customerServices) {
        this.customerServices = customerServices;
    }


    @PostMapping("/save")
    public ResponseEntity<?> saveCustomer(@RequestBody CustomerDTOInsert customerDTOInsert) {
        try {
            return ResponseEntity.ok(customerServices.saveCustomer(customerDTOInsert));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest()
                    .body(Map.of("Error", e.getMessage()));
        }
    }










}
