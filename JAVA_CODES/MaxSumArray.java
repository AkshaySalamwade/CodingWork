package JAVA_CODES;

/*
 * Maximum Subarray Sum Problem (Kadane’s Algorithm)
 * Write a Java program to find the maximum sum of a contiguous subarray using Kadane’s Algorithm.
 * 
 */



public class MaxSumArray {

    public static void main(String[] args) {

        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

                int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];  // sum from i to j
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);


         int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        System.out.println("Maximum Subarray Sum = " + maxSoFar);


        
    }
    
}
