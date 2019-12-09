package com.ing.parking.service;

import java.util.List;
import java.util.Optional;

import com.ing.parking.dto.EmployeeRequestDto;
import com.ing.parking.dto.EmployeeResponseDto;
import com.ing.parking.entity.Employee;

public interface EmployeeService {
	
	public EmployeeResponseDto saveEmployeeInfo(EmployeeRequestDto employeeRequestDto);
	
	public Optional<Employee> getEmployeeById(Integer employeeId);
	
	public List<Employee> getAllEmployees();

}
