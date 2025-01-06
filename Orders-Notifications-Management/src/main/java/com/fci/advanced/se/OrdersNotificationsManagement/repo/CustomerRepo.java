package com.fci.advanced.se.OrdersNotificationsManagement.repo;

import com.fci.advanced.se.OrdersNotificationsManagement.models.Customer;
import org.springframework.*;


public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    // Add custom query methods if needed
}
