public class EvenDigit{
    public static void main(String[] args) {
        int[] nums={23,45,789,999,990,2324};{
            System.out.println(findNumber(nums));
        }

    }
    static int findNumber(int[] nums){
        int i=0;
        for(int num:nums){
        if(even(num)){
            i++;
        }
     }
     return i;
    }
    static boolean even(int num){
       int ans= Count(num);
        if(ans % 2 == 0){
            return true;
        }
        return false;
        
       
    }
 static int Count(int num){
    int i=0;
    while(num >0){
        num= num/10;
        i++;
    }
    return i;
 }
}
