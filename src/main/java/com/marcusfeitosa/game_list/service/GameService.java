package com.marcusfeitosa.game_list.service;
import com.marcusfeitosa.game_list.dto.GameDTO;
import com.marcusfeitosa.game_list.entity.Game;
import com.marcusfeitosa.game_list.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll(){
        List<Game> allGamesArgs = gameRepository.findAll();
        List<GameDTO> allGamesDTO = allGamesArgs
                .stream()
                .map(GameDTO::new).toList();
    return allGamesDTO;
    }
}
