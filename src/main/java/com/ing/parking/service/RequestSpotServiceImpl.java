package com.ing.parking.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ing.parking.dto.RequestSpotDto;
import com.ing.parking.dto.RequestSpotResponseDto;
import com.ing.parking.entity.ReleaseSpot;
import com.ing.parking.entity.RequestSpot;
import com.ing.parking.repository.ReleaseSpotRepository;
import com.ing.parking.repository.RequestSpotRepository;

@Service
public class RequestSpotServiceImpl implements RequestSpotService{

	@Autowired
	private RequestSpotRepository requestSpotRepository;
	@Autowired
	private ReleaseSpotRepository releaseSpotRepository;
	@Override
	public RequestSpotResponseDto requestForSpot(@RequestBody RequestSpotDto requestSpotDto) {
		RequestSpot requestSpot = new RequestSpot();
		RequestSpotResponseDto requestSpotResponseDto = new RequestSpotResponseDto();
		
		List<ReleaseSpot> releaseSpotList = releaseSpotRepository.findByDate(requestSpotDto.getDate());
		
		BeanUtils.copyProperties(requestSpotDto, requestSpot);
		if(requestSpotResponseDto != null) {
			requestSpotResponseDto.setMessage("Sucessfully Requested!");
			requestSpotResponseDto.setStatusCode(200);
		}
		
		if(releaseSpotList.size()>0) {
			
			Random randomRecord = new Random();
		
			ReleaseSpot releaseSpot = releaseSpotList.get(randomRecord.nextInt(releaseSpotList.size()));
		
			releaseSpot.setTemporaryAvailable("Assigned");
			releaseSpotRepository.save(releaseSpot);
		
			requestSpotRepository.save(requestSpot);
		}
		//requestSpotRepository.findByFromDateAndToDate(requestSpotDto.getFromDate(), requestSpotDto.getToDate());
		
		
		
		return requestSpotResponseDto;
	}

}
