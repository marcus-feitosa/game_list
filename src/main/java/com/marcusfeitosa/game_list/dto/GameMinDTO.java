package com.marcusfeitosa.game_list.dto;

import com.marcusfeitosa.game_list.entity.Game;
import com.marcusfeitosa.game_list.projections.GameMinProjection;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GameMinDTO {

    private Long id;
    private String title;
    private Integer gameYear;
    private String imgUrl;
    private String shortDescription;

   public GameMinDTO(Game gameEntity) {
       id = gameEntity.getId();
       title = gameEntity.getTitle();
       gameYear = gameEntity.getGameYear();
       imgUrl = gameEntity.getImgUrl();
       shortDescription = gameEntity.getShortDescription();
   }

    public GameMinDTO(GameMinProjection gameProjectionEntity) {
        id = gameProjectionEntity.getId();
        title = gameProjectionEntity.getTitle();
        gameYear = gameProjectionEntity.getYear();
        imgUrl = gameProjectionEntity.getImgUrl();
        shortDescription = gameProjectionEntity.getShortDescription();
    }
}
