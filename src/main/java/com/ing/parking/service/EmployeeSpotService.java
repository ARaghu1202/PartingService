package com.ing.parking.service;

import com.ing.parking.dto.EmployeeSpotRequestDto;
import com.ing.parking.dto.EmployeeSpotResponseDto;

public interface EmployeeSpotService {

	EmployeeSpotResponseDto EmployeeSpotAssign(EmployeeSpotRequestDto employeeSpotRequestDto);

}
