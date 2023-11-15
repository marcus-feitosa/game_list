package com.marcusfeitosa.game_list.service;

import com.marcusfeitosa.game_list.dto.GameListDTO;
import com.marcusfeitosa.game_list.dto.GameMinDTO;
import com.marcusfeitosa.game_list.entity.Game;
import com.marcusfeitosa.game_list.entity.GameList;
import com.marcusfeitosa.game_list.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    GameListRepository gameListRepository;
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> gameListArgs = gameListRepository.findAll();
        return gameListArgs
                .stream()
                .map(GameListDTO::new).toList();
    }
}
