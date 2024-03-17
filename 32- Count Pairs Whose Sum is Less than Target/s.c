#include <stdio.h>
#include <stdlib.h>

int countPairs(int* nums, int numsSize, int target){
    int counter = 0;
    int i , j; 
    for( i =0 ; i < numsSize ; i++)
    {
        for(j = i+1 ;  j <numsSize ; j++)
        {
            if(nums[i] + nums[j] < target)
            {
                counter++;
            }
        }
    }
    return counter;
}