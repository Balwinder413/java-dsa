import java.util.*;
public class Main{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("veerji");
        System.out.println(sb);
    
    // charAt index 0
    System.out.println(sb.charAt(0));


    // set charAt index0
    // sb.setCharAt(0, 'P');
    // System.out.println(sb);

    // set charAt 
    // sb.setCharAt(4, 'g');
    // System.out.println(sb);

    // insert
    sb.insert(0, 'b');
    System.out.println(sb);

    // delete b
    sb.delete(0,2);
    System.out.println(sb);
    System.out.println(sb.length());
}

}