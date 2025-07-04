package Wissen_code;

import java.util.*;

public class FlattenArray {

    public static List<Object> flatten(Object[] input) {
        List<Object> result = new ArrayList<>();
        for (Object element : input) {
            if (element instanceof Object[]) {
                result.addAll(flatten((Object[]) element)); // Recursively flatten nested array
            } else {
                result.add(element); // Add primitive element
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Object[] input = {1, new Object[]{2, 3}, new Object[]{4, new Object[]{5, 6}}, 7};
        List<Object> flattened = flatten(input);
        System.out.println(flattened);
    }
}

