package com.ing.parking.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter@Getter
@AllArgsConstructor@NoArgsConstructor
@ToString
public class RequestSpotDto {

	private Integer empId;
	private Integer parkingId;
	private Date date;
}
