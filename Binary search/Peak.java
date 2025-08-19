import java.util.*;
public class Peak{
    public static void main(String[] args) {
        int[] arr={2,3,1,0};
        int ans=peakvalue(arr);
        System.out.println(ans);
    }
    static int  peakvalue(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
            return start;   // return end
        }
    }
