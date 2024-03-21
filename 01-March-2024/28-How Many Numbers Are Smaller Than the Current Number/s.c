int* smallerNumbersThanCurrent(int* nums, int numsSize, int* returnSize) {
    int *a = malloc(numsSize*sizeof(int));
    *returnSize = numsSize;
    int i ,j ; 
    for( i = 0 ; i < numsSize ; i++)
    {
        int counter = 0;
        for( j = 0 ;j < numsSize ; j++)
        {
            if(nums[i]> nums[j])
            {
                counter++;
            }
        }
        a[i] = counter;
    }
    return a;
}