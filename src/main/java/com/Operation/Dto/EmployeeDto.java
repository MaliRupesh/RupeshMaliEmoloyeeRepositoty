package com.Operation.Dto;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDto {

	
	
	private Long empId;
	
//	@NotEmpty
//	@Size(min = 3, message = "Min size of Employee Name  is 3")
	private String empFName;
	
//	@NotEmpty
//	@Size(min = 3, message = "Min size of Employee Last Name  is 3")
	private String empLName;
	
//	@NotEmpty
	private String empEmail;
	
//	@NotEmpty
	private Long empAge;

}
