import java.util.*;
public class ColNoFix{
    public static void main(String[] args) {
        int[][]nums={
            {1,2,3},
            {3,4},
            {3,4,5,6},
        };  
        for(int row=0; row<nums.length;row++){
            for(int col=0; col<nums[row].length; col++){
                System.out.print(nums[row][col]+ " ");
            }
            System.out.println();
        }
        }
    }