import java.util.*;
public class Pattern6{
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        for(int row=0; row<2*n; row++){
            int colInRow=row >= n ? 2 * n - row-1:row+1;

            int noOfSpaces = n-colInRow;
            for(int s=0;s < noOfSpaces; s++){
                System.out.print(" ");
            }
        for(int col=0;col < colInRow;col++){
            System.out.print("* ");
        }
        System.out.println();
        }
    }
}
