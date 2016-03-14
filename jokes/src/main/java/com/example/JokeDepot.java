package com.example;

import java.util.Random;

public class JokeDepot {

    private String[] jokes;
    private Random selection;

    public JokeDepot() {
        jokes = new String[3];
        jokes[0] = "new derp 1";
        jokes[1] = "new derp 2";
        jokes[2] = "new derp 3";
        selection = new Random();
    }

    public String getJoke() {
        return jokes[selection.nextInt(jokes.length)];
    }
}
