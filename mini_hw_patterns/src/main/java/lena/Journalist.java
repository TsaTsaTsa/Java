package lena;

import lena.patterns.Observer;

public class Journalist implements Observer {
    private String name;

    public Journalist(String name) {
        this.name = name;
    }
    @Override
    public void update(Game game) {
        System.out.println("Hi! I'm " + name + ", journalist.");
        System.out.println("Here is the information about the game " + game.getName() + ": " + game.getInfo());
    }
}
