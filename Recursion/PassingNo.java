import java.util.*;
public class PassingNo{
    public static void main(String[] args) {
        int ans=pass(5);
        System.out.println(ans);
    }
    static int pass(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        return pass(--n);
    }
}