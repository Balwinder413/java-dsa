public class First{
    public static void main(String[] args) {
        int arr[]={3,56,45,34,89,9,78};
        int target=56;

        boolean ans= Value(arr,target);
            System.out.println(ans);
        }
    

public static boolean Value(int []arr,int target){
        if(arr.length==0){
            return false;
        }
        for(int element:arr){
            if(element== target){
                return true;
            }
        }
        return false;
    } 
}

