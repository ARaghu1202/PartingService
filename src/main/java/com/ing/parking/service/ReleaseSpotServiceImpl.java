package com.ing.parking.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.parking.dto.ReleaseSpotRequestDto;
import com.ing.parking.dto.ReleaseSpotResponseDto;
import com.ing.parking.entity.ReleaseSpot;
import com.ing.parking.repository.ReleaseSpotRepository;

@Service
public class ReleaseSpotServiceImpl implements ReleaseSpotService {

	@Autowired
	private ReleaseSpotRepository releaseSpotRepository;
	@Override
	public ReleaseSpotResponseDto releaseSpot(ReleaseSpotRequestDto releaseSpotRequestDto) {
		ReleaseSpot releaseSpot = new ReleaseSpot();
		ReleaseSpotResponseDto releaseSpotResponseDto = new ReleaseSpotResponseDto();
		BeanUtils.copyProperties(releaseSpotRequestDto, releaseSpot);
		if(releaseSpotResponseDto != null) {
			releaseSpotResponseDto.setMessage("Released sucessfully");
			releaseSpotResponseDto.setStatusCode(200);
		}
		
		releaseSpotRepository.save(releaseSpot);
		return releaseSpotResponseDto;
	}

}
