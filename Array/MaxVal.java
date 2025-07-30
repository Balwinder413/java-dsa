import java.util.*;
public class MaxVal{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(Max(arr));

    }
    static int Max(int[] arr){
        int MaxNo =arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>MaxNo){
            MaxNo= arr[i];
            }
        }
        return MaxNo;
    }
}