import java.util.*;
public class Mini{
    public static void main(String[] args) {
        int[]arr={8,9,5,2,1};
        System.out.println(MinVal(arr));
        
    }
    static int MinVal(int[]arr){
        int miniNo=arr[0];
        for(int i=0;i<arr.length;i++){
        if(arr[i]<miniNo){
            miniNo=arr[i];
        }
    }
    return miniNo;
}
}