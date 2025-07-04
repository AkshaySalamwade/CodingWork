package JAVA_CODES;

public class MoveZero {

    public static void main(String[] args) {
        
       int[] arr ={1,2,3,0,5,0,1,2,0,3,6};

        int index = 0;

        for(int num : arr){
             if(num != 0)
             {
                arr[index++] = num;
             }   

        }
        while(index < arr.length){
            arr[index++] = 0;
        }




    }
    
}
