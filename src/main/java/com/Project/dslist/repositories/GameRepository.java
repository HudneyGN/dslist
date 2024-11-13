package com.Project.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
