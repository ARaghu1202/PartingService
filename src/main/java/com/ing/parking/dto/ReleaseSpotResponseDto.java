package com.ing.parking.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter@Getter
@AllArgsConstructor@NoArgsConstructor
@ToString
public class ReleaseSpotResponseDto {
	private String message;
	private Integer statusCode;
	private List<ReleaseSpotResponseDto> ReleaseSpotResponsDetails;
}
