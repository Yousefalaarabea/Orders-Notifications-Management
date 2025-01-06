package com.fci.advanced.se.OrdersNotificationsManagement.service;
import org.springframework.stereotype.Service;
import com.fci.advanced.se.OrdersNotificationsManagement.repo.CustomerRepo;
import com.fci.advanced.se.OrdersNotificationsManagement.models.Customer;

import java.util.List;
@Service
public class CustomerService {
    private final CustomerRepo custrepo;

    public CustomerService(CustomerRepo custrepo){ this.custrepo = custrepo;}

    public Customer addcust(Customer cust){return custrepo.save(cust);}

    public boolean updatecust(String Id,Customer cust){return false;}

    public List<Customer> getcusts(){return custrepo.findAll();}
}


