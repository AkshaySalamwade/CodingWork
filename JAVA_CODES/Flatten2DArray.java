package JAVA_CODES;

import java.util.Arrays;

public class Flatten2DArray {


    public static void main(String[] args) {
        
        int[][] matrix = {
            {1,2},
            {3,4},
            {5,6}
        };

         int rows = matrix.length; // 3
         int cols = matrix[0].length; // 2

         int[] flat = new int[rows * cols];

         int Index  = 0;

         for(int[] row : matrix){
             for(int num : row){
                
                flat[Index++] = num;
                
             }   

         }
         System.out.println(Arrays.toString(flat));



    }
    
}
