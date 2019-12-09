package com.ing.parking.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.parking.dto.ParkingSpotRequestDto;
import com.ing.parking.dto.ParkingSpotResponseDto;
import com.ing.parking.entity.ParkingSpot;
import com.ing.parking.repository.ParkingSpotRepository;

@Service
public class ParkingSpotServiceImpl implements ParkingSpotService{
	@Autowired
	private ParkingSpotRepository parkingSpotRepository;

	@Override
	public ParkingSpotResponseDto saveParkingSpotInfo(ParkingSpotRequestDto parkinSpotRequestDto) {
		ParkingSpot parkingSpot = new ParkingSpot();
		ParkingSpotResponseDto parkingSpotResponseDto = new ParkingSpotResponseDto();
		BeanUtils.copyProperties(parkinSpotRequestDto, parkingSpot);
		if(parkingSpotResponseDto != null) {
			parkingSpotResponseDto.setMessage("Sucessfully Saved!");
			parkingSpotResponseDto.setStatusCode(200);
		}
		parkingSpotRepository.save(parkingSpot);
		return parkingSpotResponseDto;
	}

}
