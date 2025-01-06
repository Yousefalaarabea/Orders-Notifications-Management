package com.fci.advanced.se.OrdersNotificationsManagement.models;
import lombok.*;
import jakarta.*;


import org.springframework.web.bind.annotation.*;
import java.beans.Transient;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
//@Entity
public class Customer {
 //@Id
 //@GeneratedValue(strategy = GenerationType.AUTO)

 private String username;
    private String password;
    private String address;
    private String email;
    private String phone;
    private String firstName;
    private String secondName;
    private float balance;
   // @Transient
    //private List<Product> cart;
    //@OneToMany(mappedBy = "customer" , cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    //private List<CustomerNotification> customerNotifications;
}
