package com.jss.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jss.dslist.Entities.Game;
import com.jss.dslist.dto.GameDTO;
import com.jss.dslist.dto.GameMinDTO;
//import com.jss.dslist.dto.GameMinDTO;
import com.jss.dslist.repositories.GameRepository;

@Service  //ou component
public class GameService {
  @Autowired
  private GameRepository gameRepository;
  
  @Transactional(readOnly = true) //do spring
  public GameDTO findById(Long id) {	  
	  Game result = gameRepository.findById(id).get();
	  return new GameDTO(result);	 
  }
  
  @Transactional(readOnly = true) //do spring
  public List<GameMinDTO> findAll(){
	List<Game> result = gameRepository.findAll(); 
	//List<GameMinDTO> dto =
	return  result.stream().map(x -> new GameMinDTO(x)).toList();
	
	//return dto;
	  
  }
}
