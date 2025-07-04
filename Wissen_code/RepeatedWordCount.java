package Wissen_code;

import java.util.*;

public class RepeatedWordCount {
    public static int countRepeatedWords(String sentence) {
        String[] words = sentence.toLowerCase().split("\\s+"); // split by spaces
        Map<String, Integer> wordCount = new HashMap<>();

        // Count frequency of each word
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z0-9]", ""); // remove punctuation
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Count how many words are repeated
        int repeatedCount = 0;
        for (int count : wordCount.values()) {
            if (count > 1) {
                repeatedCount++;
            }
        }

        return repeatedCount;
    }

    public static void main(String[] args) {
        String sentence = "Java is great, and Java is powerful. Java is everywhere!";
        int result = countRepeatedWords(sentence);
        System.out.println("Number of repeated words: " + result);
    }
}
