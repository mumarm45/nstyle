package com.nstyle.Controller;

import com.nstyle.Model.Employee;
import com.nstyle.Service.EmployeeService;
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
@RequestMapping(value = "/employee")
public class EmployeeController {


    @Autowired
    public EmployeeService employeeService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Iterable<Employee> getList(){

        return employeeService.getList();
    }

}
