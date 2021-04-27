package com.uncovid.help.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uncovid.help.entity.States;

@Repository
public interface StateRepository extends JpaRepository<States, Integer>{
	@Query(value = "select state_id, state_name, (select count(1) from info i where i.state_id =s.state_id) count from state s" , nativeQuery = true)
	List<States> findSpecificStates();
}
