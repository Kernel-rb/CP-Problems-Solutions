class Solution {
  public int peakIndexInMountainArray(int[] arr) {
    int start = 0 ;
    int end = arr.length - 1; 
    while(start < end){
      int midd = start + (end - start) /  2 ; 
      if(arr[midd] > arr[midd + 1]){
        end = midd;
      }else{
        start = midd + 1 ;
      }
    }
    return start; 
  }
}
