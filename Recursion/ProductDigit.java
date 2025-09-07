import java.util.*;
public class ProductDigit{
    public static void main(String[] args) {
        int ans= Product(1234);
        System.out.println(ans);
    }
    static int Product(int n){
        if(n==1){
            return 1;
        }
    
    System.out.println(n);
    return (n%10)* Product(n/10);
}
}