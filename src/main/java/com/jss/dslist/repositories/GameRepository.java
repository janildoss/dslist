package com.jss.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jss.dslist.Entities.Game;

public interface GameRepository extends JpaRepository<Game,Long> {

	
}
