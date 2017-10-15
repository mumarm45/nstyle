package com.nstyle.Service;

import com.nstyle.Model.Customer;
import com.nstyle.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mumarm45 on 15/10/2017.
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Iterable<Customer> getList(){
       return customerRepository.findAll();
    }

}
