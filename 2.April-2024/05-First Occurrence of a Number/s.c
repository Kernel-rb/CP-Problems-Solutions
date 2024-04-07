#include <stdio.h>

int premier_occurence(int nums[], int size, int target){
    int res=  -1;
    int start = 0;
    int end = size - 1;
    while(start <= end){
        int mid = start + (end - start) / 2;
        if(nums[mid] == target){
            res = mid;
            end = mid - 1;
        }
        else if(nums[mid] < target){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
    }
    return res;
}

int main(){
    int nums[] = {1, 2, 3, 4, 4,5, 6, 7, 8, 9};
    int target = 4;
    int size = sizeof(nums) / sizeof(nums[0]);
    int res = premier_occurence(nums, size, target);
    printf("%d\n", res);
    return 0;
    
}

