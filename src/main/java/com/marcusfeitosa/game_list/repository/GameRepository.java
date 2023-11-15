package com.marcusfeitosa.game_list.repository;

import com.marcusfeitosa.game_list.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository <Game, Long> {

}
