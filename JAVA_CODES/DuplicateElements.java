package JAVA_CODES;

import java.util.HashSet;
import java.util.Set;

// Write a java to find the duplicate element in array

public class DuplicateElements {

    public static void main(String[] args) {
        
       int[] arr = {1,2,3,4,2,5,1,7,8,9,10,10,15};

        Set<Integer> set  = new HashSet<>();

        for(int i : arr){

            if(set.contains(i)){
                System.out.print(i+", ");
            }
            else
             {
                set.add(i);
             }

        }
        




    }
    
}
