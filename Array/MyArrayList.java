import java.util.ArrayList;
import java.util.*;

public class MyArrayList{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        // syntax
        // MyArrayList<integer>list=new MyArrayList<>();
       
         ArrayList<Integer> list = new ArrayList<>(10);
        
    //     list.add(10);
    //     list.add(18);
    //     list.add(16);
    //     list.add(14);
    //     list.add(12);
    //     System.out.println(list.remove(1));
    // System.out.println(list.contains(1));
    // System.out.println(list.set(0,89));
    // System.out.println(list);
    

    /*************input******** */
    for(int i=0; i<5;i++){
        list.add(sc.nextInt());
    }
     for(int i=0; i<5;i++){
        System.out.println(list.get(i));
    }
    }
}