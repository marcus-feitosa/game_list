package com.marcusfeitosa.game_list.dto;

import com.marcusfeitosa.game_list.entity.GameList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(GameList gameList) {
        id = gameList.getId();
        name = gameList.getName();
    }
}
