package com.onion.data;

import org.springframework.data.jpa.repository.JpaRepository;
import com.onion.web.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
