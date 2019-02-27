package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListUtility {
    private List<Integer> currentList = new ArrayList<>();

    public Boolean add(Integer i) {
            return currentList.add(i);
    }

    public Integer size() {
        return currentList.size();
    }

    public List<Integer> getUnique() {
        return new ArrayList<>(new HashSet<>(currentList));
    }

    public String join() {
        return currentList.toString().substring(1, currentList.toString().length()-1);
    }

    public Integer mostCommon() {
        ArrayUtility arrayUtility = new ArrayUtility();
        return arrayUtility.mostCommon(currentList.toArray(new Integer[currentList.size()]));
    }

    public Boolean contains(Integer valueToAdd) {
        return currentList.contains(valueToAdd);
    }
}
