package com.Operation.Service;

import java.util.List;

import com.Operation.Dto.EmployeeDto;

public interface EmployeeServiceI {

	public EmployeeDto SaveEmployee(EmployeeDto empDto);
	
	public List<EmployeeDto> getAllEmployee();
	
	public EmployeeDto getEmployee(Long empId);
	
	public EmployeeDto UpdateEmployee(EmployeeDto  empDto,Long empId );
	
	public void  DeleteEmployee (Long empId );
	
}
