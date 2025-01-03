import java.util.ArrayList;
import java.util.List;

public class Main  {
    public static void main(String[] argv){
        int[] arr = {4,3,2,7,8,2,3,1}; // [ 1 , 2 ,3 ,4 ,3 ,2 ,7 ,8] 
        cycleSort(arr);
        System.out.println(findDuplicates(arr));
    }
    public static List<Integer> findDuplicates(int[] arr) {
            List<Integer> r  = new ArrayList<Integer>();
            for(int i = 0  ; i <  arr.length  ; i++){
                if(arr[i] != i + 1 ){
                    r.add(arr[i]);
                }
            }
            return r;
    }

    public static void cycleSort(int[] arr){
        int i = 0; 
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            } else{
                i++;
            }
        }
    }

    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}