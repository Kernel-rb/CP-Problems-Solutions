#include <stdlib.h>
int* findPeaks(int* m, int mountainSize, int* returnSize) {
    int* peak = (int*)malloc(mountainSize * sizeof(int));
    int count = 0;
    for (int i = 1; i < mountainSize - 1; i++) {
        if (m[i] > m[i + 1] && m[i] > m[i - 1]) {
            peak[count++] = i;
        }
    }
    *returnSize = count;
    return peak;
}

