package lena;

import lena.patterns.Observer;

public class Developer implements Observer {
    private String name;
    public Developer(String name) {
        this.name = name;
    }
    @Override
    public void update(Game game) {
        System.out.println("Hi! I'm " + name + ", developer.");
        System.out.println("Here is the data about the game " + game.getName() + ": " + game.getInfo());
    }
}
