package com.marcusfeitosa.game_list.service;
import com.marcusfeitosa.game_list.dto.GameDTO;
import com.marcusfeitosa.game_list.dto.GameMinDTO;
import com.marcusfeitosa.game_list.entity.Game;
import com.marcusfeitosa.game_list.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> allGamesArgs = gameRepository.findAll();
        List<GameMinDTO> allGamesDTO = allGamesArgs
                .stream()
                .map(GameMinDTO::new).toList();
    return allGamesDTO;
    }

    @Transactional(readOnly = true)
    public GameDTO findGameById(Long id){
        try{
            Game game = gameRepository.findById(id).get();
            return new GameDTO(game);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
