package patterns.bridge.projects;

import patterns.bridge.developers.Developer;

public class Website extends Project {
    public Website(Developer developer) {
        super(developer);
    }

    @Override
    public void developerProject() {
        System.out.println("Website development in progress");
        developer.codding();
    }
}
