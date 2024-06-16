int countPairs(int* nums, int numsSize, int k) {
    int counter =0 ;
    int  i = 0;
    int j = 0;
    for(i = 0; i < numsSize; i++){
        for(j = i+1; j < numsSize; j++){
            if ( nums[i] ==  nums[j] && (i * j) % k == 0 ){
                counter++;
            }
        }
    }
    return counter;
}