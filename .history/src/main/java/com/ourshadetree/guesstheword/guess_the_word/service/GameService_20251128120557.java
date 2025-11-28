package com.ourshadetree.guesstheword.guess_the_word.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class GameService {

    private String[] randomWords = {"father", "mother", "sister", "string", "hello", "light", "java"};

    Random random = new Random();
    
    @Override
    public String toString() {
        return "";
    }
}
