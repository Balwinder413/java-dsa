

public class StringEx {
    public static void main(String[] args) {
        String name="balwinder";
         char target= 'l';
        Boolean result= Search(name,target);
        System.out.println(result);
    }
    
static boolean Search(String str,char target){
    if(str.length()==0){
        return false;
    }
    for(int i=0; i<str.length();i++){
        if(target== str. charAt(i)){
            return true;
        }
    }
    return false;
}
}