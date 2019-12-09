package com.ing.parking.service;

import com.ing.parking.dto.RequestSpotDto;
import com.ing.parking.dto.RequestSpotResponseDto;

public interface RequestSpotService {

	RequestSpotResponseDto requestForSpot(RequestSpotDto requestSpotDto);

}
