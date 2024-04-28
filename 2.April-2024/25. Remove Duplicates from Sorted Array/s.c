int removeDuplicates(int* nums, int numsSize) {
    if (numsSize == 0) return 0;
    int i0 = 0 ;
    for (int i = 1; i < numsSize; i++) {
        if (nums[i] != nums[i0]) {
            i0++;
            nums[i0] = nums[i];
        }
    }
    return i0 + 1;
}