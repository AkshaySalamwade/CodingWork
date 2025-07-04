package Wissen_code;

public class JumpGame {

    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};


        int i = 0;
        while(i<arr.length)
        {
            if(i == arr.length-1){
                System.out.println("True");
            }
            else{
                if(arr[i] == 0)
                break;
                
                i +=arr[i];
            }


        }
    }
    
}
