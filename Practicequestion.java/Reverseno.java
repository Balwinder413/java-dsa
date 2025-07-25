import java.util.*;
class Reverseno{
    public static void main(String[] args) {
        System.out.println("ReverseNumber");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int i=0;
        while(n>0){
            int rem = n % 10;
            n= n/ 10;
            i = i * 10 + rem;
        }
                System.out.println(i);

    }
}
 
