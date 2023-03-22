package com.Operation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Operation.Pojo.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	
}
