class LinearSearch{
    public static void main(String[] args) {
        int[] nums={45,67,23,89,9,0,5,4};
         int target=9;
        int ans = LinearSearch(nums,target);
       
        System.out.println(ans);
        
    }


    
    // search target return element

    static int LinearSearch2(int []arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int element:arr){
            if(element== target){
                return element;
            }
        }
        return -1;
    }


    
    // search array: return index if item found
    // otherwise not found return -1

    static int LinearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        // run loop
        for(int i=0; i<arr.length; i++){
            // check element
            int element=arr[i];
            if(element == target){
                return i;
            }
        }
            // this line will execute if none return the statement above executed hence the target not found  
            return -1;
}
}
