public class buble {
    public  static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        // buble
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length -1-i; j++){
            if (arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
    }
} 
printArray(arr);
 }
}


// class buble{
//     public static void printArray(int arr[]){
//         for(int i=0; i< arr.length;i++){
//             System.out.print(arr[i]);
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[]={9,4,6,2,4};
//         // buble
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr.length-1-i; j++){
//                if( arr[j]> arr[j+1]){
// {
//     int temp=arr[j];
//     arr[j]= arr[j+1];
//     arr[j+1]= temp;
// }            }

//         }
//     }
//     printArray(arr);
// }
// }
