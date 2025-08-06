import java.util.*;
public class BubleSort{
    public static void main(String[] args) {
        int[]arr={8,7,4,0,4};
        search(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void  search(int []arr){
        boolean swapped;
        for(int i=0; i< arr.length;i++){
            swapped =false;
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped =true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}