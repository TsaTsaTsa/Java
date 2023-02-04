package patterns.bridge.projects;

import patterns.bridge.developers.Developer;

public abstract class Project {
    protected Developer developer;

    public Project(Developer developer) {
        this.developer = developer;
    }

    public abstract void developerProject();
}
