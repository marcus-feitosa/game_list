package com.marcusfeitosa.game_list.dto;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.marcusfeitosa.game_list.entity.Game;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameDTO {
    private Long id;
    private String title;
    private Integer gameYear;
    private String genre;
    private String platform;
    private String score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO(Game game) {
        BeanUtils.copyProperties(game, this);
    }
}

