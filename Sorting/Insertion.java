import java.util.*;
public class Insertion{
    public static void main(String[] args) {
        int[] arr={2,8,9,10,5,2,1};
        Insert(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Insert(int[]arr){
        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1; j>0;j--){
                if(arr[j] <arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}