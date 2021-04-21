package com.uncovid.takehelp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uncovid.takehelp.entity.Help;

@Repository
public interface TakeHelpRepository extends JpaRepository<Help, Integer> {

	@Query("select * from help")
	List getHelp(Help helpReq);

}
