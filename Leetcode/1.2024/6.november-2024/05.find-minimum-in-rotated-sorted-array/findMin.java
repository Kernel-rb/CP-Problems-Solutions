public class findMin {
  public static void main(String[] args) {
    int[] arr = {3,4,5,1,2};
    int r = minimuimOfRotatedArr(arr);
    System.out.println(r);
  }

  public static  int minimuimOfRotatedArr(int[] arr){
    int s  = 0; 
    int e  = arr.length - 1; 
    while(s < e){
      int mid = s + (e - s) / 2 ; 
      if(arr[mid] > arr[e]  ){
        s = mid + 1;
      }else{
        e = mid;
      }
     }
    return arr[s];
    }
  } 

