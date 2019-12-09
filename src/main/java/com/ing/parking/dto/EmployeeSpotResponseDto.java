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
public class EmployeeSpotResponseDto {
	private String message;
	private Integer statusCode;
	private List<EmployeeSpotRequestDto> EmployeeSpotDetails;
}
