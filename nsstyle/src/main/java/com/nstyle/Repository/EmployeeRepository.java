package com.nstyle.Repository;

import com.nstyle.Model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mumarm45 on 15/10/2017.
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
