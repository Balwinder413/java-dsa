public class SearchInRange{
    public static void main(String[] args) {
        int[] arr={3,1,2,7,5,9,0,4,78};
        int target=9;
        int ans=Range(arr,target,1,7);
        System.out.println(ans);
        
    }

static int Range(int[]arr,int target,int start,int end){
    if(arr.length== 0){
        return -1;
    }
    for(int i= start; i<= end; i++){
        int element= arr[i];
        if(element== target){
            return i;
        }
    }
    return-1;
}
}