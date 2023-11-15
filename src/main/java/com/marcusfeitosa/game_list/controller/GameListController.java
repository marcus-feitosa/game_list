package com.marcusfeitosa.game_list.controller;

import com.marcusfeitosa.game_list.dto.GameListDTO;
import com.marcusfeitosa.game_list.dto.GameMinDTO;
import com.marcusfeitosa.game_list.entity.GameList;
import com.marcusfeitosa.game_list.service.GameListService;
import com.marcusfeitosa.game_list.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GameListDTO> getAll(){
        return gameListService.findAll();
    }

    @GetMapping("/{id}/games")
    @ResponseStatus(HttpStatus.OK)
    public List<GameMinDTO> getByList(@PathVariable Long id){
        return gameService.findAllByList(id);
    }
}
