package com.marcusfeitosa.game_list.controller;

import com.marcusfeitosa.game_list.dto.GameDTO;
import com.marcusfeitosa.game_list.entity.Game;
import com.marcusfeitosa.game_list.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    GameService gameService;
    @GetMapping

    public ResponseEntity getAll(){
        List<GameDTO> result = gameService.findAll();
        return ResponseEntity.ok(result);
    }
}
