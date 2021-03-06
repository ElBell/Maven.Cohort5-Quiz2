package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayUtility {

    public Integer[] merge(Integer[] array1, Integer[] array2) {
        List<Integer> answer = new ArrayList<>(Arrays.asList(array1));
        answer.addAll(Arrays.asList(array2));
        return answer.toArray(new Integer[0]);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return merge(Arrays.copyOfRange(array, index, array.length), Arrays.copyOfRange(array, 0, index));
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return countOccurrence(merge(array1, array2), valueToEvaluate);
    }

    public Integer countOccurrence(Integer[] array, Integer valueToEvaluate) {
        return Collections.frequency(Arrays.asList(array), valueToEvaluate);
    }

    public Integer mostCommon(Integer[] array) {
        Arrays.sort(array, (a, b) -> countOccurrence(array, a) - countOccurrence(array, b));
        return array[array.length - 1];
    }
}
