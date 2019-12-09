package com.ing.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.parking.entity.ReleaseSpot;
import com.ing.parking.entity.RequestSpot;

@Repository
public interface RequestSpotRepository extends JpaRepository<RequestSpot, Integer> {

	void save(ReleaseSpot releaseSpot);

}
