package patterns.bridge;



import patterns.bridge.developers.JuniorDeveloper;
import patterns.bridge.developers.SeniorDeveloper;
import patterns.bridge.projects.Database;
import patterns.bridge.projects.Project;
import patterns.bridge.projects.Website;

import java.util.ArrayList;
import java.util.List;

public class ProjectCreator {
    public static void main(String[] args) {
        List<Project> projects = new ArrayList<>();
        projects.add(new Database(new JuniorDeveloper()));
        projects.add(new Website(new SeniorDeveloper()));

        for (Project project: projects) {
            project.developerProject();
        }
    }
}