package Wissen_code;

public class SecondLargestFinder {
    
    public static void main(String[] args) {
        
       int[] arr = {10, 5, 20, 8, 7};

       int max = Integer.MIN_VALUE;
       int secondMax = Integer.MIN_VALUE;


        for(int num : arr){

              if(num > max)
              {
                secondMax = max;
                max = num; 

              }
              else if(num > secondMax && num < max){

                secondMax = num;

              }


        }

         System.out.println(secondMax);

    }
}
