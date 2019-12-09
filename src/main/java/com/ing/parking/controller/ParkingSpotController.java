package com.ing.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.parking.dto.ParkingSpotRequestDto;
import com.ing.parking.dto.ParkingSpotResponseDto;
import com.ing.parking.service.ParkingSpotService;

@RestController
@RequestMapping("/parkingspots")
public class ParkingSpotController {
	
	@Autowired
	private ParkingSpotService parkingSpotService;
	
	@PostMapping("")
	public ResponseEntity<ParkingSpotResponseDto> saveParkingInfo(ParkingSpotRequestDto parkinSpotRequestDto) {
		ParkingSpotResponseDto parkingSpotResponseDto = parkingSpotService.saveParkingSpotInfo(parkinSpotRequestDto);
		return new ResponseEntity<>(parkingSpotResponseDto, HttpStatus.OK);
	}
	

}
