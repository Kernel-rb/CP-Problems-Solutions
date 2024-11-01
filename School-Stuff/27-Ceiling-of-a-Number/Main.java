public class Main {
  public static void main(String[] args){
    int[] arr = { 2 , 3 , 5 , 9 , 14 , 16 , 18};
    int r = CeilingofaNumber(arr , 4);
    System.out.println(r);
  }

  public static int CeilingofaNumber(int[] arr , int target){
    if(target > arr[arr.length - 1 ] return -1;
    int start = 0; 
    int end = arr.length - 1 ;
    while(start <= end){
      int midd =  start  + (end - start ) / 2; 
      if(arr[midd] < target){
        start = midd + 1;
      }else{
        end  = midd  - 1;
        }
      }
    }
    return start;
  }
}
