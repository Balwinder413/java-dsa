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