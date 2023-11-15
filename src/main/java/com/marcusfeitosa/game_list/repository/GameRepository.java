package com.marcusfeitosa.game_list.repository;

import com.marcusfeitosa.game_list.entity.Game;
import com.marcusfeitosa.game_list.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository <Game, Long> {
    @Query(nativeQuery = true, value = """
		SELECT t_game.id, t_game.title, t_game.game_year AS `year`, t_game.img_url AS imgUrl,
		t_game.short_description AS shortDescription, t_belonging.position
		FROM t_game
		INNER JOIN t_belonging ON t_game.id = t_belonging.game_id
		WHERE t_belonging.game_list_id = :listId
		ORDER BY t_belonging.position
			""")
	List<GameMinProjection> searchByList(Long listId);
}
