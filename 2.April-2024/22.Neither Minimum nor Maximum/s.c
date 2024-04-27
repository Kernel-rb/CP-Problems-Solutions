int findNonMinOrMax(int* nums, int numsSize){
    if(numsSize < 3) return -1;
    int temp;
    int i , j ;
    for(i = 0 ; i < numsSize ; i++){
        for(j = i + 1 ; j < numsSize ; j++){
            if(arr[i] > arr[j]){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            };
        };
    };
    return nums[1];
}