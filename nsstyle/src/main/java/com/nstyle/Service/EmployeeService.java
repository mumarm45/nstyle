package com.nstyle.Service;

import com.nstyle.Model.Employee;
import com.nstyle.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mumarm45 on 15/10/2017.
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Iterable<Employee> getList(){
       return employeeRepository.findAll();
    }

}
