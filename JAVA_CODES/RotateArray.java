package JAVA_CODES;

import java.util.Arrays;

public class RotateArray {

     public static void reverse(int[]arr, int start, int end){

           while(start < end ){
              int temp=arr[start];
              arr[start] = arr[end];
              arr[end] = temp;
              start++;
              end--;


           }     


     }



    public static void main(String[] args) {

         int[] arr = {1,2,3,4,5,6,7};
         int n= 2;
         int size = arr.length; // 7
         
         // code by taking new array right sift
         int[] cparr  = new int[size]; 

         for(int i=0; i<size;i++){
            // int index = (i - n + size) % size;    for left shift 
            int index = (i+n)%size;
            cparr[index] = arr[i]; 

         }
        
         System.out.println(Arrays.toString(cparr));
        

         int m = n%size;

         reverse(arr, 0, m-1);
         reverse(arr, m, size-1);
         reverse(arr, 0, size-1);

         // code withoud taking new array------------------------
         System.out.println(Arrays.toString(arr));



        
    }
    
}
