package com.marcusfeitosa.game_list.dto;

import com.marcusfeitosa.game_list.entity.Game;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GameDTO {

    private Long id;
    private String title;
    private Integer gameYear;
    private String imgUrl;
    private String shortDescription;

   public GameDTO(Game gameEntity) {
       id = gameEntity.getId();
       title = gameEntity.getTitle();
       gameYear = gameEntity.getGameYear();
       imgUrl = gameEntity.getImgUrl();
       shortDescription = gameEntity.getShortDescription();

   }
}
