int searchInsert(int* nums, int numsSize, int target) {
    int start = 0;
    int end = numsSize - 1;
    int mid;
    while (start <= end) {
        mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return start;
}