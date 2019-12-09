package com.ing.parking.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter@Getter
@AllArgsConstructor@NoArgsConstructor
@ToString
public class EmployeeRequestDto {
	
	private String empName;
	private String empEmail;
	private String empPhoneNumber;
	private String empExperience;
	private String password;
	private String vehicleNumber;

}
