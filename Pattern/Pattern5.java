import java.util.*;
public class Pattern5{
    public static void main(String[] args) {
        print(8);
        
    }
    static void print(int n){
        for(int row=1; row< 2*n;row++){
            int colInRow=row>n ?2*n-row-1:row;
                for(int col=1;col<colInRow;col++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    
}