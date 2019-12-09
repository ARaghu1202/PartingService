package com.ing.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.parking.dto.EmployeeSpotRequestDto;
import com.ing.parking.dto.EmployeeSpotResponseDto;
import com.ing.parking.service.EmployeeSpotService;

@RestController
@RequestMapping("/employeespots")
public class EmployeeSpotController {
	@Autowired
	private EmployeeSpotService employeeSpotService;

	@PostMapping("")
	public ResponseEntity<EmployeeSpotResponseDto> saveEmployeeSpotInfo(EmployeeSpotRequestDto employeeSpotRequestDto) {
		EmployeeSpotResponseDto employeeResponseDto	= employeeSpotService.EmployeeSpotAssign(employeeSpotRequestDto);
		return new ResponseEntity<>(employeeResponseDto, HttpStatus.OK);
	}
}
