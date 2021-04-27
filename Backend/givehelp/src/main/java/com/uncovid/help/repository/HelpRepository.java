package com.uncovid.help.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uncovid.help.entity.Help;
import com.uncovid.help.entity.States;

@Repository
public interface HelpRepository extends JpaRepository<Help, Integer>{
	

}
