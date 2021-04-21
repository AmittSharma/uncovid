package com.uncovid.help.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uncovid.help.entity.States;

@Repository
public interface StateRepository extends JpaRepository<States, Integer>{

}
