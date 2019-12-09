package com.ing.parking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.parking.dto.EmployeeRequestDto;
import com.ing.parking.dto.EmployeeResponseDto;
import com.ing.parking.entity.Employee;
import com.ing.parking.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("")
	public ResponseEntity<EmployeeResponseDto> saveEmployeeInfo(@RequestBody EmployeeRequestDto employeeRequestDto) {
		 EmployeeResponseDto employeeResponseDto = employeeService.saveEmployeeInfo(employeeRequestDto);
		 if(employeeResponseDto!=null)
		   {
			 employeeResponseDto.setStatusCode(200);
			 employeeResponseDto.setMessage("Sucessfully Saved");
		   }

		 return new ResponseEntity<>(employeeResponseDto, HttpStatus.OK);
	}
	
	@GetMapping("/{employeeId}")
	public ResponseEntity<Optional<Employee>> findEmployeeById(@PathVariable Integer employeeId){
		
		Optional<Employee> employee = employeeService.getEmployeeById(employeeId);
		
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}
	
	@GetMapping("")
	public ResponseEntity<List<Employee>> getEmployees(){
		List<Employee> employeesList = employeeService.getAllEmployees();
		return new ResponseEntity<>(employeesList, HttpStatus.OK);
	}
	

}
