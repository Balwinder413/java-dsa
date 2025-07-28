import java.util.*;
public class PassingByFunction{
    public static void main(String[] args) {
        int[] num={2,3,4,5,6,7};
        System.out.println(Arrays.toString(num));
 change(num);
    System.out.println(Arrays.toString(num));
 }
 
    static void change(int[]arr){
        arr[2]=45;
    }
}