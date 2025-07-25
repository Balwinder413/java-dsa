 import java.util.*;

public class Checkcase {
    public static void main(String[] args) {
        System.out.println("Check upper or lower case");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(ch >='a' && ch <='z'){
            System.out.println("Lower case");
        }
        else {
            System.out.println("Upper case");
        }
    }
}
