package lena;

import java.util.List;

public class Game {
    private String name;
    private List<String> achievements;
    private String info;
    private String data;

    public Game(String name, List<String> achievement, String info, String data) {
        this.name = name;
        this.achievements = achievement;
        this.info = info;
        this.data = data;
    }
    public String getName() {
        return name;
    }

    public String getData() {
        return data;
    }

    public String getInfo() {
        return info;
    }

    public List<String> getAchievements() {
        return achievements;
    }
}
