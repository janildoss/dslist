package com.jss.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jss.dslist.Entities.GameList;

//Camada de acesso a dados
public interface GameListRepository extends JpaRepository<GameList,Long> {

	
}
