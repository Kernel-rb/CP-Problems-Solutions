public class Solution {
    public int SumOfSquares(int[] nums) {
        int n = nums.Length;
        int counter = 0;
        for(int i =0 ; i < n; i++){
            if( n % (i+1) == 0 ){
                int c = nums[i] * nums[i];
                counter += c;
            }
        }
        return counter;
    }
}