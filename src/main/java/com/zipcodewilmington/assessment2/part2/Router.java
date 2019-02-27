package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Router {
    HashMap<String, String> pathControllerMap = new HashMap<>();
    public void add(String path, String controller) {
        pathControllerMap.put(path, controller);
    }

    public Integer size() {
        return pathControllerMap.size();
    }

    public String getController(String path) {
        return pathControllerMap.get(path);
    }
//    public String getController(String path) {
//        Set<String> keys = pathControllerMap.keySet();
//        for(String key : keys) {
//            String current = pathControllerMap.get(key);
//                if(current.equals(path)) {
//                    return key;
//                }
//        }
//        return null;
//    }

    public void update(String path, String studentController) {
        pathControllerMap.put(path, studentController);
    }

    public void remove(String path) {
        pathControllerMap.remove(path);
    }

    @Override
    public String toString() {
        String string = "";
        Set<String> keys = pathControllerMap.keySet();
        for(String key : keys) {
            string = (key + " -> " + pathControllerMap.get(key) + "\n") + string;
        }
        return string.toString();
    }
}
