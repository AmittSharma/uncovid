package com.uncovid.help.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uncovid.help.entity.District;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer> {

	List<District> findByStateId(int stateId);

//	District findByStateId(Integer stateId);

//	List<District> getListOfDistricts(Integer stateId);

}
