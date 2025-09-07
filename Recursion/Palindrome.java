import java.util.*;
public class Palindrome{
    public static void main(String[] args) {
        System.out.println(Palindrome(121));
    }
    static int sum=0;
    static int rev(int n){
        if(n==0){
            return sum;
        }
        int rem= n%10;
        sum= sum*10+rem;
        return rev(n/10);
    }
    static boolean Palindrome(int n){
        return n== rev(n);
        
    }
}