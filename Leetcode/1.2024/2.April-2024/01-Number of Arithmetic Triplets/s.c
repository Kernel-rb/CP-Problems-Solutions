int arithmeticTriplets(int* nums, int numsSize, int diff) {
    int nb_triplets = 0;
    int i = 0;
    int j = i +1;
    int k = j +1;
    for(i = 0; i < numsSize; i++){
        for(j = i + 1; j < numsSize; j++){
            if(nums[j] - nums[i] == diff){
                for(k = j + 1; k < numsSize; k++){
                    if(nums[k] - nums[j] == diff){
                        nb_triplets++;
                    }
                }
            }
        }
    }
    return nb_triplets;
}