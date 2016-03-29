package com.joreo;

import java.util.Random;

public class JokeDepot {

    private String[] jokes;
    private Random selection;

    public JokeDepot() {
        jokes = new String[3];
        jokes[0] = "new derf 1";
        jokes[1] = "new derp 2";
        jokes[2] = "The ladies always say Khaled you smell good, " +
                "I use no cologne. Cocoa butter is the key. A major key, never panic. " +
                "Don't panic, when it gets crazy and rough, don't panic, stay calm. " +
                "You do know, you do know that they don't want you to have lunch. " +
                "I'm keeping it real with you, so what you going do is have lunch. " +
                "Let's see what Chef Dee got that they don't want us to eat. " +
                "The key is to enjoy life, because they don't want you to enjoy life. " +
                "I promise you, they don't want you to jetski, they don't want you to smile. " +
                "It's on you how you want to live your life. Everyone has a choice. " +
                "I pick my choice, squeaky clean.";
        selection = new Random();
    }

    public String getJoke() {
        return jokes[selection.nextInt(jokes.length)];
    }
}
