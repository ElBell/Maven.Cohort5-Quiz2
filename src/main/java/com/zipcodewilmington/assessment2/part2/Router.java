package com.zipcodewilmington.assessment2.part2;


import java.util.Set;
import java.util.TreeMap;

public class Router {
    private TreeMap<String, String> pathControllerMap = new TreeMap<>();
    public void add(String path, String controller) {
        pathControllerMap.put(path, controller);
    }

    public Integer size() {
        return pathControllerMap.size();
    }

    public String getController(String path) {
        return pathControllerMap.get(path);
    }

    public void update(String path, String studentController) {
        pathControllerMap.put(path, studentController);
    }

    public void remove(String path) {
        pathControllerMap.remove(path);
    }

    @Override
    public String toString() {
        StringBuilder pathsAndControllers = new StringBuilder();
        Set<String> paths = pathControllerMap.keySet();
        for(String path : paths) {
            pathsAndControllers.append(path + " -> " + getController(path) + "\n");
        }
        return pathsAndControllers.toString();
    }


}
