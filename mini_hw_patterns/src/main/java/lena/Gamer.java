package lena;

import lena.patterns.Observer;


public class Gamer implements Observer {
    private String name;
    public Gamer(String name) {
        this.name = name;
    }
    @Override
    public void update(Game game) {
        System.out.println("Hi! I'm " + name + ", gamer.");
        System.out.println("A new game " + game.getName() + " has been released.");

        if (game.getAchievements().isEmpty()) {
            System.out.println("The game hasn't any achievements\n");

            return;
        }

        System.out.println("Here are the achievements of the game: ");
        for (var achievement : game.getAchievements()) {
            System.out.println(achievement);
        }
    }
}
