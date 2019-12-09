package com.ing.parking.service;

import com.ing.parking.dto.ParkingSpotRequestDto;
import com.ing.parking.dto.ParkingSpotResponseDto;

public interface ParkingSpotService {

	public ParkingSpotResponseDto saveParkingSpotInfo(ParkingSpotRequestDto parkinSpotRequestDto);
	

}
