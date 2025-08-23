import java.util.*;
public class RBS{
    public static void main(String[] args) {
        int []arr={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(arr, target));
      
        
    }
    static int search (int[]arr,int target){
        int pivot= findpivot(arr);


        // not found
        if(pivot==-1){
            return binarysearch(arr, target, 0, arr.length-1);
        }
        // found having 2 cases
        if(arr[pivot]==target){
            return pivot;
        } 
        if(target>=arr[0]){
            return binarysearch(arr, target, 0, pivot-1);
        }
        return binarysearch(arr, target, pivot+1, arr.length-1);
    

    }
    static int binarysearch(int[]arr,int target,int start,int end){
        while (start<=end) {
            
        int mid= start+(end- start)/2;
        if(arr[mid]== target){
            return mid;
        }
            if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }
        }
        return -1;
    }

    static  int findpivot(int[]arr){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid= start+(end-start)/2;
            // 4 cases 
            if(mid< end&&arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid>start&&arr[mid]<arr[mid-1]){
                return mid-1;
            } else if(arr[start]<=arr[mid]){
                end= mid-1;
            }else{
                start=mid+1;
            }
            }
            return-1;// not found
        }
    }
    