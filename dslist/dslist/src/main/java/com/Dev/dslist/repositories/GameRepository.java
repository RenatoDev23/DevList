package com.Dev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Dev.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
	

}
