import java.util.*;
public class Array2D{
    public static void main(String[] args) {
        int[][] arr=new int[4][2];
        // syntax of 2d array
        // int[][] nums= new int[][];
    //     int [][] arr2D={
    //         {1,2,3}  0th inex
    //         {4,5,6}  1st index
    //         {7,8,9}    2nd index
    //     };
          Scanner sc= new Scanner(System.in);

          /********input*********/

        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                arr[row][col]= sc.nextInt();
               
            }
        }

        /*****output *****/
      for(int[]a: arr){
        System.out.println(Arrays.toString(a));
}
        
      }
}

       /***********output************/

    //      for(int row=0; row<arr.length; row++){
    //         for(int col=0; col<arr[row].length; col++){
    //             System.out.print(arr[row][col] + " ");
    //         }
    //         System.out.println();
        
    //     }
    //     System.out.println(Arrays.toString(arr[row][col]));
    // }


   /********output******/
//          for(int row=0; row<arr.length; row++){
//           System.out.println(Arrays.toString(arr[row]));
// }

