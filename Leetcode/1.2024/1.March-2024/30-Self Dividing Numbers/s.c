int* selfDividingNumbers(int left, int right, int* returnSize) {
    int *a = (int *)malloc(sizeof(int) * (right - left + 1));
    int len = 0;
    for (int i = left; i <= right; i++) {
        int num = i;
        int isDivide = 1;
        while (num) {
            int digit = num % 10;
            if (digit == 0 || i % digit != 0) {
                isDivide = 0;
                break;
            }
            num /= 10;
        }
        if (isDivide) {
            a[len++] = i;
        }
    }
    *returnSize = len;
    return a;   
}