package com.ing.parking.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter@Getter
@AllArgsConstructor@NoArgsConstructor
@ToString
public class ParkingSpotRequestDto {

	private String slotNumber;
	//Available/RESERVED
	private String parkingStatus;
}
