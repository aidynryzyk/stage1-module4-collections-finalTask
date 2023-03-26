package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();
        for (String project:
             projects.keySet()) {
            if (projects.get(project).contains(developer)) {
                list.add(project);
            }
        }
        list.sort(String::compareTo);
        list.sort(Comparator.reverseOrder());
        list.sort(Comparator.comparing(String::length).reversed());
        return list;
    }
}
