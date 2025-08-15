import java.util.*;
public class Pattern8{
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        for(int row=1; row<=2*n;row++){
            int c= row>n? 2*n-row:row;
             
            for(int s=0;s<n-c; s++){
                System.out.print("  ");
            }
           
            for(int col=c;col>=1;col--){
                System.out.print(col+ " ");
            }
            for(int col=2;col<=c;col++){
            System.out.print(col+ " ");
        }
        System.out.println();
    }
}
}