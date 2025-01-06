package com.fci.advanced.se.OrdersNotificationsManagement.controllers;
import com.fci.advanced.se.OrdersNotificationsManagement.models.Customer;
import com.fci.advanced.se.OrdersNotificationsManagement.service.CustomerService;

import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class CustomerController {
    private final CustomerService custservice;

    public CustomerController(CustomerService custservice){this.custservice = custservice;}

    @PostMapping("/customers")
    public Customer addcust(@RequestBody Customer cust){
        return custservice.addcust(cust);
    }

    @GetMapping("/customers")
    public List<Customer> getcusts(){
        return custservice.getcusts();
    }

    @PutMapping("/customers/{custId}") //addcust
    public String UpdateCust(@RequestBody Customer cust, @PathVariable("custId") String custId){
        if(custservice.updatecust(custId, cust)){
            return "User Updated successfully";
        }
        return "Failed to update user";
    }
}
