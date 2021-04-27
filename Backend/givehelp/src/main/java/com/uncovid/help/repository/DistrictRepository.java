package com.uncovid.help.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uncovid.help.entity.District;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer> {

	@Query(value = "select dis_id, dis_name, state_id, (select count(1) from info i where i.state_id = d.state_id and i.dis_id = d.dis_id) count from district d where d.state_id = ?1 ", nativeQuery = true)
	List<District> findSpecificDistrict(int stateId);

}
