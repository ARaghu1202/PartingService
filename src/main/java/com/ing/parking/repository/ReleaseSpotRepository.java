package com.ing.parking.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.parking.entity.ReleaseSpot;

@Repository
public interface ReleaseSpotRepository extends JpaRepository<ReleaseSpot, Integer>{

	public List<ReleaseSpot> findByDate(Date date);
}
