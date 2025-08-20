import java.util.*;
public class PeakMountain{
    public static void main(String[] args) {
        int[]arr={3,2,1,0};
        int target=1;
        int peak=peakvalue(arr);
        int firstTry=orderagnostics(arr,target,0,peak);
        if(firstTry!=-1){
            System.out.println(firstTry);
            return ;
        }
        // try to search second half
        int secondTry= orderagnostics(arr, target, peak+1, arr.length-1);
    
       System.out.println(secondTry);
        
    }
     static int peakvalue(int[]arr){
        int start=0;
    int end= arr.length-1;
    
    while(start<end){
        int mid=start+(end-start)/2;
        if(arr[mid]>arr[mid+1]){
            end=mid;
        }else{
            start=mid+1;
        }
    }
    return start;
}


static int orderagnostics(int[]arr,int target,int start,int end){
    boolean isAsc;
    if(arr[start]<arr[end]){
       isAsc= true;
    }else{
        isAsc=false;
    }
    while (start<=end) {
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }

        if(isAsc){
        if(target<arr[mid]){
            start=mid+1;
        } else {
            end=mid-1;
        } 
    } else{
if(target>arr[mid]){
    start=mid+1;
}else{
    end=mid-1;
}
    }
}
    return-1;
}
}
    
