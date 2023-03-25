import lena.*;
import lena.patterns.Observer;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GameService gameService = new GameService();

        List<Observer> people = Arrays.asList(
                new Gamer("Masha"),
                new Journalist("Pasha"),
                new Developer("Denis"),
                new Journalist("Kate"),
                new Gamer("Julia")
        );

        for (var person : people) {
            gameService.attachObserver(person);
        }

        gameService.releaseGame(new Game(
                "Hotline Miami",
                Arrays.asList("Combo Beginner", "Playing Pool", "Combo Intermediate", "Domino Effect"),
                "Hotline Miami is a high-octane action game overflowing\n" +
                        "with raw brutality, hard-boiled gunplay and skull\n" +
                        "crushing close combat" + System.lineSeparator(),
                "OS:Microsoft® Windows® XP / Vista / 7\n" +
                        "Processor:1.2GHz processor\n" +
                        "Memory:512 MB RAM")
        );

        gameService.releaseGame(new Game(
                "Broforce",
                Arrays.asList("You're Fired", "Your eyes can deceive you", "Shaken, Not Stirred", "I'll Be Back"),
                "When evil threatens the world, the world calls on Broforce - an under-funded, over-powered\n" +
                        "paramilitary organization dealing exclusively in excessive force. Brace your loins with up\n" +
                        "to four players to run ‘n’ gun as dozens of different bros and eliminate the opposing terrorist\n" +
                        "forces that threaten our way of life." + System.lineSeparator(),
                "OS: Windows Vista or Later\n" +
                        "Processor: Intel Core™ Duo or faster\n" +
                        "Memory: 4 GB RAM")
        );

        gameService.releaseGame(new Game(
                "It Takes Two",
                Arrays.asList("Justified risk", "Commander in chief", "Death from above"),
                "Embark on the craziest journey of your life in It Takes Two,\n" +
                        "a genre-bending platform adventure created purely for co-op.\n" + System.lineSeparator(),
                "OS\n" +
                        "Windows 8.1 64-bit or Windows 10 64-bit\n" +
                        "Processor\n" +
                        "Intel Core i3-2100T or AMD FX 6100\n" +
                        "Memory\n" +
                        "8GB")
        );

    }
}