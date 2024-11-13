package com.devsuperior.dslist.repositries;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.dslist.entities.Game;

public interface GameListRepository extends JpaRepository<Game, Long> {
}