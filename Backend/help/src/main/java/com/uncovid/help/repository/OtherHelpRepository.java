package com.uncovid.help.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uncovid.help.entity.OtherHelp;


@Repository
public interface OtherHelpRepository extends JpaRepository<OtherHelp, Integer>{

}
