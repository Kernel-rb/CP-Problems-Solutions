/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* shuffle(int* nums, int numsSize, int n, int* returnSize) {
    *returnSize = 2 * n;
    int* result = (int*)malloc(2 * n * sizeof(int));
    int i = 0, k = n;
    while (i < n) {
        result[2 * i] = nums[i];
        result[2 * i + 1] = nums[k];
        i++;
        k++;
    }
    return result;
}

