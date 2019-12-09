package com.ing.parking.service;

import com.ing.parking.dto.ReleaseSpotRequestDto;
import com.ing.parking.dto.ReleaseSpotResponseDto;

public interface ReleaseSpotService {

	ReleaseSpotResponseDto releaseSpot(ReleaseSpotRequestDto releaseSpotRequestDto);

}
