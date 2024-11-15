package com.Project.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.dslist.dto.GameListDTO;
import com.Project.dslist.dto.GameMinDto;
import com.Project.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> findall(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}

}
