import java.util.*;
public class CountSteps{
    public static void main(String[] args) {
        int ans = count(1345);
        System.out.println(ans);
    }
    static int count(int n){
        return helper(n,0);
    }
    private static int helper(int num,int steps){
        if(num==0){
            return steps;
        }
        
        if(num % 2 ==0){
            return helper(num/2, steps+1);
        }
        return helper(num-1, steps+1);
    }
}