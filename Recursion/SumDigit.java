import java.util.*;
public class SumDigit{
    public static void main(String[] args) {
        int ans=digit(12345);
        System.out.println(ans);
    }
    static int digit(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
         return (n%10)+ digit(n/10);
        
    }
}