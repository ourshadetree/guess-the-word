package com.ourshadetree.guesstheword.guess_the_word.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class GameService {

    private String randomlyChosenWord = null;

    private String[] randomWords = {"father", "mother", "sister", "string", "hello", "light", "java"};

    Random random = new Random();

    public GameService() {
        randomlyChosenWord = randomWords[random.nextInt(randomWords.length)]
    }
    
    @Override
    public String toString() {

        String ret = "";

        return "";
    }
}
