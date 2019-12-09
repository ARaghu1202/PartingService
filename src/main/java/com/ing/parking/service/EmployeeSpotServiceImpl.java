package com.ing.parking.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.parking.dto.EmployeeSpotRequestDto;
import com.ing.parking.dto.EmployeeSpotResponseDto;
import com.ing.parking.entity.EmployeeSpot;
import com.ing.parking.repository.EmployeeSpotRepository;

@Service
public class EmployeeSpotServiceImpl implements EmployeeSpotService {
	@Autowired
	private EmployeeSpotRepository employeeSpotRepository;

	@Override
	public EmployeeSpotResponseDto EmployeeSpotAssign(EmployeeSpotRequestDto employeeSpotRequestDto) {
		EmployeeSpot employeeSpot = new EmployeeSpot();
		EmployeeSpotResponseDto employeeSpotResponseDto = new EmployeeSpotResponseDto();
		BeanUtils.copyProperties(employeeSpotRequestDto, employeeSpot);
		if(employeeSpotResponseDto !=null ) {
			employeeSpotResponseDto.setMessage("Sucessfully Assigned");
			employeeSpotResponseDto.setStatusCode(200);
			employeeSpotRepository.save(employeeSpot);
		}
		return employeeSpotResponseDto;
	}

}
