import java.util.Arrays;
public class Main {
  public static void main(String[] args){
    int[] arr = {5,7,7,8,8,10};
    System.out.println(Arrays.toString(searchRange(arr , 8)));
    System.out.println(Arrays.toString(searchRange(arr, 6)));
  }

  public static   int[] searchRange(int[] nums, int target) {
    if(nums.length == 0) return new int[]{-1 , -1};
    int start = first_time_appear(nums , target);
    int end = last_time_appear(nums , target);
    return new int[]{start , end};
  }

  public static int  first_time_appear(int[] nums , int target) {
    if(nums[0] == target) return 0; 
    int start = 0; 
    int end = nums.length - 1; 
    int r = -1;
    while(start <= end){
      int midd = start + (end - start) / 2; 
      if(nums[midd] >  target){
        end = midd - 1; 
      }else if(nums[midd] < target){
        start = midd + 1;
      }else{
        r = midd;
        end = midd - 1; 
      }
    }
    return r ;
  }

  public static int  last_time_appear(int[] nums , int target) {
    if(nums[nums.length - 1] == target) return nums.length - 1;
    int start = 0; 
    int end = nums.length - 1; 
    int r = -1;
    while(start <= end){
      int midd = start + (end - start) / 2;
      if(nums[midd] > target){
        end = midd -1;
      }else if(nums[midd] < target){
        start = midd + 1;
      }else{
        r = midd;
        start = midd  + 1;
      }
    }
    return r;
  }
}
