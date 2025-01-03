void sortColors(int* nums, int numsSize) {
    bool swapped = false;
    for(int i = 0 ; i < numsSize - 1 ; i++){
        swapped = false;
        for(int j = 0 ; j < numsSize - i - 1 ; j++){
            if(nums[j] > nums[j+1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
                swapped = true;
            }
        }
        if(!swapped){
            break;
        }
    }   
}