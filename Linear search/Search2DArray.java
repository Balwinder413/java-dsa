import java.util.*;
public class Search2DArray{
    public static void main(String[] args) {
        int[][] arr={
            {23,4,5,6},
            {21,2,3,8,9},
            {99,88}
        };
        int target=23;
        int[] ans = search(arr, target);
            System.out.println(Arrays.toString(ans));
    

    }
    static int[] search(int[][]arr,int target){
      
        for(int row=0; row<arr.length; row++){
            for(int col=0; col< arr[row].length; col++){
        if(arr[row][col]== target){
            return new int []{row,col};
        }
    } 
}
    return new int []{-1,-1};

    }
}