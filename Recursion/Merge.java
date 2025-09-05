import java.util.*;
public class Merge{
    public static void main(String[] args) {
bothprint(5);
        
    }
    static void print1(int n){
        if(n==0){
            System.out.println(0);
            return ;
        }
        System.out.println(n);
        print1(n-1);
    }
    static void print2(int n){
        if(n==5){
            System.out.println(5);
            return ;
        }
        print2(n+1);
        System.out.println(n);
        
    }
    static void bothprint(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        bothprint(n-1);
        System.out.println(n);
     }
}