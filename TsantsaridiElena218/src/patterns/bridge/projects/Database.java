package patterns.bridge.projects;

import patterns.bridge.developers.Developer;

public class Database extends Project {

    public Database(Developer developer) {
        super(developer);
    }

    @Override
    public void developerProject() {
        System.out.println("Database development in progress");
        developer.codding();
    }
}
