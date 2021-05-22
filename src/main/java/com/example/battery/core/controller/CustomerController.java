package com.example.battery.core.controller;


import com.example.battery.core.entity.Customer;
import com.example.battery.core.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author chuzefang
 * @since 2021-05-22
 */
@RestController
@RequestMapping("/core/customer")
public class CustomerController {

    @Resource
    CustomerService customerService;

    @GetMapping("/getAll")
    public List<Customer> getAllCustomerInfo() {
        return customerService.getAllCustomer();
    }
}

