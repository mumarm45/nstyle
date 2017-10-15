package com.nstyle.Controller;

import com.nstyle.Model.Customer;
import com.nstyle.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mumarm45 on 15/10/2017.
 */
@RestController
@RequestMapping(value = "/customer")
public class CustomerController {


    @Autowired
    public CustomerService customerService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Iterable<Customer> getList(){

        return customerService.getList();
    }

}
