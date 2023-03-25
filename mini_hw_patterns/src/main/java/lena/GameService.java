package lena;

import lena.patterns.Observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GameService {
    private final List<Observer> observers = new ArrayList<>();
    private final List<Game> games = new ArrayList<>();

    public void releaseGame(Game game) {
        games.add(game);

        System.out.printf("Released a new game: " + game.getName() + '\n');
        System.out.println("______________________________________________");
        notifyAllObservers();
    }

    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    public void detachObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(games.get(games.size() - 1));
            System.out.println("______________________________________________");

            //System.out.println();
        }
    }
}
