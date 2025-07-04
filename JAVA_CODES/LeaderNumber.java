package JAVA_CODES;

/*
 * Program to Find All Leaders in an Integer Array
 * -->  An element is a leader if it is greater than all elements to its right.
 * Input: arr = {16, 17, 4, 3, 5, 2}
   Leaders: 17 5 2
 */

public class LeaderNumber {

    public static void main(String[] args) {
        
        int[] arr = {16, 17, 4, 3, 5, 2};
 
         int n = arr.length;
         int maxRight = arr[n-1];
         System.out.println(maxRight);

         for(int i=n-2; i>=0;i--)
         {
                if(arr[i] > maxRight)
                {
                    maxRight = arr[i];
                    System.out.println(maxRight);

                }


         }




       

        }



    }
    

