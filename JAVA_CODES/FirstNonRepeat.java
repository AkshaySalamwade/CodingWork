package JAVA_CODES;


import java.util.LinkedHashMap;
import java.util.Map;

// find the first Non Repeating element in Array 
 

public class FirstNonRepeat {

    public static void main(String[] args) {
        
        int[] arr = {1,3,4,5,2,3,4,1};

        Map<Integer,Integer> map = new LinkedHashMap<>();

        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(int key : map.keySet()){

            if(map.get(key) == 1){
                System.out.println(key);
            }
        }
       

    }
    
}
