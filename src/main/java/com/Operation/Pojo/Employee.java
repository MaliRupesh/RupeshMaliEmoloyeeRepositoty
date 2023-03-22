package com.Operation.Pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Employee_Details")
public class Employee {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private Long empId;
	
	@Column(name="First_Name")
	private String empFName;
	
	@Column(name="Last_Name")
	private String empLName;
	
	@Column(name="Email")
	private String empEmail;
	
	@Column(name="Age")
	private Long empAge;

	
	
	
}
