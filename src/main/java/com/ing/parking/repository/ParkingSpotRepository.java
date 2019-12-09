package com.ing.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.parking.entity.ParkingSpot;
@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, Integer> {

}
