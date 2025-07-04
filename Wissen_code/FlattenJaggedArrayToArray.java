package Wissen_code;

import java.util.Arrays;

public class FlattenJaggedArrayToArray {
    public static void main(String[] args) {
        int[][] jagged = {
            {1, 2, 3},
            {4, 5},
            {6},
            {7, 8, 9, 10}
        };

        // Step 1: Calculate total size
        int totalSize = 0;
        for (int[] row : jagged) {
            totalSize += row.length;
        }

        // Step 2: Create flat array
        int[] flatArray = new int[totalSize];

        // Step 3: Fill the flat array
        int index = 0;
        for (int[] row : jagged) {
            for (int num : row) {
                flatArray[index++] = num;
            }
        }

        // Output
        System.out.println("Flattened array: " + Arrays.toString(flatArray));
    }
}
