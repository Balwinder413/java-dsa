// declare
public class Strings {

   public static void main(String[] var0) {
      String name= "ballu";
      String fullName = "balwinder kaur";
      String sentence = "champo ka bna pampo ";
      System.out.println(name);
      System.out.println(sentence);
   }
}
// user input
import java.util.*;
 public class Strings{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("my name is:"+ name);
    }
 }

 

 // concatenation 
 import java.util.*;
 public class Strings{
   public static void main(String[] args) {
      String name="veer";
      String lastName="ji";
      String fullName= name+ " "+lastName;
      System.out.println(fullName);
      System.out.println(fullName.length());
  
 // charAt
 for(int i=0; i<fullName.length();i++){
 public static void main(String[] args) {
  
 }
}
 }
}




 //compare
  import java.util.*;
 public class Strings{
  public static void main(String[] args) {

   String name1="veer ji";
   String name2="bhaiya";

    if(name1.compareTo(name2)==0){
      System.out.println("string equal");
    } else {
      System.out.println("not eual");
      }
  }
}
//  s1>s2=+ve value
//     s1 == s2= 0
//     1<s2=-ve value




    import java.util.*;
 public class Strings{
  public static void main(String[] args) {

   String sentence ="veer ji";
   String name= sentence.substring(5,sentence.length());
   System.out.println(name);
  }
}
// example 2 (substring )
 import java.util.*;
 public class Strings{
  public static void main(String[] args) {
    String sentence="my name is ballu";
    String name=sentence.substring(3,sentence.length());
    System.out.println(name);
  }
 }
 
