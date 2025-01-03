import java.util.*;

class a {
    public static void main(String[] argv){
        int[] arr = { -4 , - 1 , 0 , 3 , 10 };
        q(arr);
        System.out.println(Arrays.toString(arr));
        e(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static  void  q(int[] arr){
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = (int)Math.pow((double) arr[i] , 2.00);
        }
    }




    /*
    //public static void e(int[] arr){
      //  for(int i = 0 ; i < arr.length ; i++){
        //int lIdx = arr.length - i - 1;
        //int maxIdx = getMaxIndex(arr , 0 , lIdx);
         //swap(arr , maxIdx  , lIdx );
        
    }
    public static int getMaxIndex(int[] arr , int s , int e){
        int m = s;
        for(int i  = 0 ; i< arr.length ; i++){
        if(arr[i] > arr[m]){
         m = i;
        }
        }
         return m;
    }
    public static void swap(int[] arr , int f , int l ) {
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }
    */

}
