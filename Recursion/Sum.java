import java.util.*;
public class Sum{
    public static void main(String[] args) {
        int ans= fact(5);
        System.out.println( ans);
    }
    static int fact(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        return n+fact(n-1);
    }
}