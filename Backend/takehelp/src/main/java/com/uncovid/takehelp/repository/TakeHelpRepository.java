package com.uncovid.takehelp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uncovid.takehelp.entity.Help;

@Repository
public interface TakeHelpRepository extends JpaRepository<Help, Integer> {

	@Query(value = "select * from uncovid.info i where i.dis_id = ?1 and i.cat_id = ?2", nativeQuery = true)
	List<Help> findByDistrictId(int disctrictId, int categoryId);

}
