bool isArraySpecial(int* nums, int numsSize) {
    if (numsSize == 0) return true;
    int i;
    for(i = 1 ; i < numsSize ; i++){
        if(nums[i- 1 ] % 2 == 0 && nums[i] % 2 == 0 || nums[i- 1 ] % 2 != 0 && nums[i] % 2 != 0){
            return false;
        }
    }
    return true;
}