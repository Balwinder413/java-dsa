import java.util.*;
class Input2{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
                String[] str= new String[3];
                for(int i=0;i<str.length;i++){
                str[i]= sc.next();
    }
  System.out.println(Arrays.toString(str));
  str[2]="ballu";
  System.out.println(Arrays.toString(str));

}
}