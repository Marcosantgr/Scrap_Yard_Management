package com.scrapyard.management.Services.Impl;
import com.scrapyard.management.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class CustomerServImpl {

    @Autowired
    private final CustomerRepo customerRepo;


    public CustomerServImpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }













}
