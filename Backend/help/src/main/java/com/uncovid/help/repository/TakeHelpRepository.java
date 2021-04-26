package com.uncovid.help.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uncovid.help.entity.TakeHelp;



@Repository
public interface TakeHelpRepository extends JpaRepository<TakeHelp, Integer> {

	@Query(value = "select *,(select state_name from state s where s.state_id = i.state_id) state_name,\r\n" + 
			"(select dis_name from district d where d.dis_id = i.dis_id) district_name,\r\n" + 
			"(select cat_name from category c where c.cat_id = i.cat_id) category_name from info i where i.dis_id = ?1 and i.cat_id = ?2 and i.state_id = ?3", nativeQuery = true)
	List<TakeHelp> findSpecificHelp(int districtId, int categoryId, int stateId);

}
