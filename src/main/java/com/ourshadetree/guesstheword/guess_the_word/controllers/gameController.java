package com.ourshadetree.guesstheword.guess_the_word.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ourshadetree.guesstheword.guess_the_word.service.GameService;

@Controller

public class gameController {

    @Autowired
    GameService gameService;
    
    @GetMapping("game-home")
    public String showGameHomePage(@RequestParam(value = "guessedChar", required = false) String guessedChar, Model model) {

        System.out.println("captured guessed word is " + guessedChar);

        String randomWord = gameService.toString();
        model.addAttribute("wordToDisplay", randomWord);
        return "game-home-page";
    }

}
