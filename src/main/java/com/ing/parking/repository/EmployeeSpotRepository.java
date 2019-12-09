package com.ing.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.parking.entity.EmployeeSpot;

@Repository
public interface EmployeeSpotRepository extends JpaRepository<EmployeeSpot, Integer> {

}
