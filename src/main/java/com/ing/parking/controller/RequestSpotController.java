package com.ing.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.parking.dto.RequestSpotDto;
import com.ing.parking.dto.RequestSpotResponseDto;
import com.ing.parking.service.RequestSpotService;

@RestController
@RequestMapping("/requestspots")
public class RequestSpotController {
	
	@Autowired
	private RequestSpotService requestSpotService;
	
	@PostMapping("")
	public ResponseEntity<RequestSpotResponseDto> requestForSpot(RequestSpotDto requestSpotDto) {
		RequestSpotResponseDto requestSpotResponseDto = requestSpotService.requestForSpot(requestSpotDto);
		return new ResponseEntity<>(requestSpotResponseDto, HttpStatus.OK);
	}

}
