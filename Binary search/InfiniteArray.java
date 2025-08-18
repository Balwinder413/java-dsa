import java.util.*;
public class InfiniteArray{
    public static void main(String[] args) {
        int[]arr={2,3,4,5,6,8,9,10,34,56,78,90};
        int target=34;
        
        System.out.println(search(arr,target));
    }
    static int search(int[]arr,int target){
        int start=0;
        int end=1;
        while(end<arr.length&& target>arr[end]){
            int newStart=end+1;
             end= end+(end-start+1)*2;
            start=newStart;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[]arr,int target,int start,int end){
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}