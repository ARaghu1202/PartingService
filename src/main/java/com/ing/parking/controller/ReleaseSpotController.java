package com.ing.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.parking.dto.ReleaseSpotRequestDto;
import com.ing.parking.dto.ReleaseSpotResponseDto;
import com.ing.parking.service.ReleaseSpotService;

@RestController
@RequestMapping("/releasespots")
public class ReleaseSpotController {
	@Autowired
	private ReleaseSpotService releaseSpotService;
	@PostMapping("")
	public ResponseEntity<ReleaseSpotResponseDto> releaseSpot(@RequestBody ReleaseSpotRequestDto releaseSpotRequestDto){
		ReleaseSpotResponseDto releaseSpotResponseDto = releaseSpotService.releaseSpot(releaseSpotRequestDto);
		return new ResponseEntity<> (releaseSpotResponseDto, HttpStatus.OK);
		
	}

}
