 import java.util.*;

public class fibbo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = in.nextInt();

        int firstNum = 0;
        int secondNum = 1;

        for ( int i = 0; i<=number; i++){
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
    
        }
        System.out.println(firstNum);
    }
}
