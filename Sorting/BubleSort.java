import java.util.*;
public class Buble{
    public static void main(String[] args) {
        int[]arr={5,7,8,2,1,4,5};
        bublesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bublesort(int[]arr){
        for(int i=0; i<arr.length;i++){
            boolean swapped=false;
            for(int j=1;j<arr.length-i;j++){
            
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
