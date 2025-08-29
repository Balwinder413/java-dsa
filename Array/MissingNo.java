import java.util.*;
public class MissingNo{
    public static void main(String[] args) {
        int []arr={1,2,4,5,6,7};
        int n= arr.length+1;
        for(int i=1;i<=n;i++){
            boolean found=false;
            for(int num:arr){
            if( num == i){
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("missingno:" +i);
            break;
        }
    }
}
}