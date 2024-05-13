class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        // sort nums1 :
        for(int i = 0 ; i < nums1.length; i ++ ){
            for(int j = i+ 1 ; j < nums1.length ; j++ ){
                int tmp = 0 ;
                if(nums1[i] > nums1[j]){
                    tmp = nums1[i];
                    nums1[i]  = nums1[j];
                    nums1[j] = tmp;
                }
            }
        }
        
        // sort num2 
        for(int i = 0 ; i < nums2.length; i ++ ){
            for(int j = i+ 1 ; j < nums2.length ; j++ ){
                int tmp = 0 ;
                if(nums2[i] > nums2[j]){
                    tmp = nums2[i];
                    nums2[i]  = nums2[j];
                    nums2[j] = tmp;
                }
            }
        }
        // diff
        for(int i = 0; i < nums1.length ; i++){
            return  nums2[i] - nums1[i];
        }
        return 0; 
    }
}