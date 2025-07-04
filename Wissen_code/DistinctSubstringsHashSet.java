package Wissen_code;

import java.util.*;

public class DistinctSubstringsHashSet {
    public static int countDistinctSubstrings(String str) {
        Set<String> substrings = new HashSet<>();

        // Generate all substrings
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                substrings.add(str.substring(i, j));
            }
        }

        // Optional: count empty substring
        substrings.add(""); // if you want to include the empty string

        return substrings.size();
    }

    public static void main(String[] args) {
        String input = "abc";
        int result = countDistinctSubstrings(input);
        System.out.println("Number of distinct substrings: " + result);
    }
}
