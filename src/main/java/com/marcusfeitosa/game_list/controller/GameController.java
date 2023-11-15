package com.marcusfeitosa.game_list.controller;

import com.marcusfeitosa.game_list.dto.GameDTO;
import com.marcusfeitosa.game_list.dto.GameMinDTO;
import com.marcusfeitosa.game_list.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    GameService gameService;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GameMinDTO> getAll(){
        return gameService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public GameDTO getGameById(@PathVariable Long id){
        return gameService.findGameById(id);
    }
}
