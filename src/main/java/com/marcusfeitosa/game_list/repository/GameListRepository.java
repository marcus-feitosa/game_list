package com.marcusfeitosa.game_list.repository;

import com.marcusfeitosa.game_list.entity.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository <GameList, Long> {

}
