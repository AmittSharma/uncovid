package com.uncovid.takehelp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uncovid.takehelp.entity.OtherHelp;

@Repository
public interface OtherHelpRepository extends JpaRepository<OtherHelp, Integer>{

}
