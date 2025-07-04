package JAVA_CODES;

import java.util.*;
/*
 * 
 Sort 0 and 1 Problem Statement
Given an integer array ARR of size N containing only integers 0 and 1, implement a function to sort this array.
The solution should scan the array only once without using any additional arrays.

 * 
 */









public class Sort_Zero_One {


    public static void main(String[] args) {
        
          int[] arr={1,1,0,1,1};

          int start = 0;
          int end = arr.length-1;

          while(start < end){

              if(arr[start] == 0)
              start++;

              if(arr[end] == 1)
              end--;

              if(arr[end] == 0){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
              }

          }
          System.out.println(Arrays.toString(arr));

          






    }
    
}
