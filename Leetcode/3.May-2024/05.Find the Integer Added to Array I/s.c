int addedInteger(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    // sort arr 1  :
    for(int i = 0 ; i < nums1Size ; i++){
        for(int j = i+1 ; j < nums1Size ; j++){
            if(nums1[i] > nums1[j]){
            int temp = nums1[i];
            nums1[i] = nums1[j];
            nums1[j] = temp;
            };
        }
    }   
    // sort arr 2 : 
    for(int i = 0 ; i < nums2Size ; i++){
        for(int j = i+1 ; j < nums2Size ; j++){
            if(nums2[i] > nums2[j]){
            int temp = nums2[i];
            nums2[i] = nums2[j];
            nums2[j] = temp;
            };
        }
    }   


    // diff : 
    for(int i = 0 ; i < nums2Size ; i++){
        return   nums2[i] - nums1[i];
    }
    return 0 ;
}