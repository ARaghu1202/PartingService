package com.ing.parking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.parking.dto.EmployeeRequestDto;
import com.ing.parking.dto.EmployeeResponseDto;
import com.ing.parking.entity.Employee;
import com.ing.parking.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeResponseDto saveEmployeeInfo(EmployeeRequestDto employeeRequestDto) {
		Employee employee = new Employee();
		EmployeeResponseDto response = new EmployeeResponseDto();
			BeanUtils.copyProperties(employeeRequestDto, employee);
			employeeRepository.save(employee);
			response.setMessage("sucessfully Saved");
			response.setStatusCode(200);
			return response;
	}

	@Override
	public Optional<Employee> getEmployeeById(Integer employeeId) {
		
		return employeeRepository.findById(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

}
