import java.util.*;
public class LinearSearch{
    public static void main(String[] args) {
        int []arr={2,3,4,5,69,7,1};
        System.out.println(find(arr, 4, 0));
        System.out.println(findAtFirst(arr, 4, 0));
        System.out.println(findAtLast(arr, 4, arr.length-1));
        
    }
    static boolean find(int arr[],int target,int index){
        if(index== arr.length){
            return false;
        }
        return arr[index]==target||find(arr, target, index+1);
    }
    static int findAtFirst(int arr[],int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return findAtFirst(arr, target, index+1);
        }
    }
    static int findAtLast(int arr[],int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return findAtLast(arr, target, index-1);
        }
    }
}