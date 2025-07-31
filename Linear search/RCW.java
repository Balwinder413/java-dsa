import java.util.*;
public class RCW{
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}
    };
        int ans=maximumWealth( accounts);
        System.out.println(ans);
        } 
    
     public static int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE; 
        // person:row
        // account: col
        for(int person=0; person <accounts.length; person++){
            int sum=0;
            for(int account=0;account<accounts[person].length; account++){
                sum += accounts[person][account];

            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
