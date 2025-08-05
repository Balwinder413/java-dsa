 import java.util.*;
 public class FirstLastPosition {
    public static void main(String[] args) {
       int[]  nums = {5,7,7,8,8,10};
        int target = 8;
        int[]ans=searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }
        
    static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=search(nums,target,true);
        ans[1] =search(nums,target,false);
        
        return ans;
    }
        // check first occurance
        

// this function retun the index of target
static int search(int[]nums,int target,boolean firstStartIndex){
     int ans=-1;
        
        int start=0;
        int end=nums.length-1;

        while(start<= end){
           int  mid= start+(end-start)/2;
            if(target>nums[mid]){
                start= mid+1;
            }else if(nums[mid]>target){
                end= mid-1;
            } else{
                ans= mid;
                if(firstStartIndex){
                    end= mid-1;

                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
}
}