import java.util.*;
public class MaxRange{
    public static void main(String[] args) {
        int[]arr={2,3,7,5,8,9};
        System.out.println(Max(arr,2 ,5));
    }
    static int Max(int[]arr,int start,int end){
        int maxvalue= arr[start];
        for(int i=start;i<= end;i++) {
            if(arr[i]>maxvalue){
            maxvalue= arr[i];
        }
    }
    return maxvalue;
}    
}
