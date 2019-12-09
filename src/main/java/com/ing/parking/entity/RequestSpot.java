package com.ing.parking.entity;

import java.sql.Date;

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
@Table(name="PARKING_REQUEST")
public class RequestSpot {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestId;
	private Integer empId;
	private Integer parkingId;
	private Date fromDate;
	private Date toDate;
}
