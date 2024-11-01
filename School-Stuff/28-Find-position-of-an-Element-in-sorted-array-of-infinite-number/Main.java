//! infinite numbers ==  on doit pas utiliser length

public class Main {
  public static void main(String[] args) {
    
  }
  public static int answer(int[] arr , int target) {
    // find the range 
    // box size => 2
    int start = 0;
    int end = 1;

    // condition for the target 
    while(arr[end] < target ){
      int newStart = end + 1;
      end  = end + (end - start + 1 ) * 2 ;
      start = newStart;
    }

    return binarySearch(arr , target , start , end);
  }

  public static int binarySearch(int[] arr , int target , int start , int end){
    while(start <= end){
      int midd = start + (end - start) /2;
      if(arr[midd] < target){
        start = midd + 1;
      }else if(target > arr[midd] ){
        end = midd - 1;
      }else{
        return midd;
      }
    }
    return -1;
  }
}
