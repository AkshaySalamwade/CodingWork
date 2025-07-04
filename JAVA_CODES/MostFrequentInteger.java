package JAVA_CODES;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentInteger {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 3, 3, 3, 2, 2};

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFreq = 0;
        int mostFrequent = arr[0];

        // Count frequency of each number
        for (int num : arr) {
            int freq = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, freq);

            // Track most frequent number
            if (freq > maxFreq) {
                maxFreq = freq;
                mostFrequent = num;
            }
        }

        System.out.println("Most frequent number: " + mostFrequent);
        System.out.println("Frequency: " + maxFreq);
    }
}