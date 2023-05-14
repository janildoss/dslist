package com.jss.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jss.dslist.Entities.GameList;
import com.jss.dslist.dto.GameListDTO;
import com.jss.dslist.repositories.GameListRepository;

@Service  //ou component
public class GameListService {
  @Autowired
  private GameListRepository gameListRepository;
  
   
  @Transactional(readOnly = true) //do spring
  public List<GameListDTO> findAll(){
	List<GameList> result = gameListRepository.findAll(); 
	
	return  result.stream().map(x -> new GameListDTO(x)).toList();	
	  
  }
}
