/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* numbers, int numbersSize, int target, int* returnSize) {
    int* arr = (int*)calloc(2, sizeof(int)); 
    *returnSize = 2; 
    int f_pointer = 0;
    int l_pointer = numbersSize - 1;
    while (f_pointer < l_pointer) {
        if (numbers[f_pointer] + numbers[l_pointer] == target) {
            arr[0] = f_pointer + 1;
            arr[1] = l_pointer + 1;
            return arr;
        } else if (numbers[f_pointer] + numbers[l_pointer] < target) {
            f_pointer++;
        } else {
            l_pointer--;
        }
    }
    free(arr); 
}

