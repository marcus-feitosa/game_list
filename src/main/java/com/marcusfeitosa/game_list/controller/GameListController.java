package com.marcusfeitosa.game_list.controller;

import com.marcusfeitosa.game_list.dto.GameListDTO;
import com.marcusfeitosa.game_list.entity.GameList;
import com.marcusfeitosa.game_list.service.GameListService;
import com.marcusfeitosa.game_list.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> getAll(){
        return gameListService.findAll();
    }
}
