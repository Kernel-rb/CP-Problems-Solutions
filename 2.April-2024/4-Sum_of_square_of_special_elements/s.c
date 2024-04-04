int sumOfSquares(int* nums, int numsSize){
    int counter = 0;
    for(int i = 0; i < numsSize; i++){
        if ( numsSize %  (i + 1) == 0){
            int c = nums[i] * nums[i];
            counter += c;
        }
    }
    return counter;
}