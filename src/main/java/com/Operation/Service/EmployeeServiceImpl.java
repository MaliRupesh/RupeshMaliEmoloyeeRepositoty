package com.Operation.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Operation.Dto.EmployeeDto;
import com.Operation.Exception.ResourceNotFoundException;
import com.Operation.Pojo.Employee;
import com.Operation.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI  {
	
	@Autowired
	private  EmployeeRepository  employeeRepo;
	@Autowired
	private ModelMapper mapper;
	
	
	

	@Override
	public EmployeeDto SaveEmployee(EmployeeDto empDto) {
		Employee employee = this.mapper.map(empDto, Employee.class);
		
	Employee saveEmp = this.employeeRepo.save(employee);
	
		return this.mapper.map(saveEmp, EmployeeDto.class);
	}

	@Override
	public List<EmployeeDto> getAllEmployee() {
		List<Employee> findAll = this.employeeRepo.findAll();
		 List<EmployeeDto> list = findAll.stream().map((all)-> this.mapper.map(all, EmployeeDto.class)).collect(Collectors.toList());
		
		return list;
	}

	@Override
	public EmployeeDto getEmployee(Long empId) {
		Employee getEmployee = this.employeeRepo.findById(empId).orElseThrow(()-> new ResourceNotFoundException("Empid", "EmpId", empId) );
		return this.mapper.map(getEmployee, EmployeeDto.class) ;
	}

	@Override
	public EmployeeDto UpdateEmployee(EmployeeDto empDto, Long empId) {
		Employee updateEmp = this.employeeRepo.findById(empId).orElseThrow(()-> new ResourceNotFoundException("Empid", "EmpId", empId) );
	
		updateEmp.setEmpFName(empDto.getEmpFName());
		updateEmp.setEmpLName(empDto.getEmpLName());
		updateEmp.setEmpEmail(empDto.getEmpEmail());
		updateEmp.setEmpAge(empDto.getEmpAge());
		
		Employee saveEmployee = this.employeeRepo.save(updateEmp);
		
		return this.mapper.map(saveEmployee,EmployeeDto.class);
	}

	@Override
	public void DeleteEmployee(Long empId) {
		Employee deleteEmployee = this.employeeRepo.findById(empId).orElseThrow(()-> new ResourceNotFoundException("Empid", "EmpId", empId) );
		this.employeeRepo.delete(deleteEmployee);
	}

	
}
