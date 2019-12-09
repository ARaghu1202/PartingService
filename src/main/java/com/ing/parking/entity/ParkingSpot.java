package com.ing.parking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter@Getter
@AllArgsConstructor@NoArgsConstructor
@ToString
@Table(name="PARKING_SPOT")
public class ParkingSpot {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer parkingId;
	private String slotNumber;
	//Available/RESERVED
	private String parkingStatus;
}
