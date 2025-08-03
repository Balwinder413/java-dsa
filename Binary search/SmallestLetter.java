import java.util.*;
public class SmallestLetter{
    public static void main(String[] args) {
        char[] letters={'j','l','m'};
        char target= 'n';
        char ans=Symbol(letters, target);
        System.out.println(ans);
    }
    static char Symbol(char[] letters, char target){
        int  start=0;
        int  end=letters.length;
        while(start<end){
            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            } 
        }  
         return letters[start % letters.length];   
               }

            }
        
    
