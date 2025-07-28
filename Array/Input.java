import java.util.*;
public class Input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //array of primitive
        // syntax of array
// datatype[] varible_name= new datatype[size];
        int [] arr= new int[5];
        arr[0]=1;
        arr[1]=3;
        arr[2]=5;
        arr[3]=7;
        arr[4]=9;
        //[1,3,5,7,9]
        System.out.println(arr[2]);

        // input using loops 
        for(int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();  
    }
System.out.println(Arrays.toString(arr));


    // for(int i=0; i<arr.length;i++){
    //     System.out.print(arr[i]+ " ");
    // }
    // for(int num:arr){   // num represent element of array
    //     System.out.print(num+ " ");
    // }
}
}


// int[] roll;  = declaration of array
// roll= new int[5] actualy here are object created in memoery