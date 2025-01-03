#include <stdio.h>
#include <stdlib.h>


int compare(const void *a, const void *b) {
    return (*(int*)b - *(int*)a);
}

int minimumCost(int* cost, int n) {
    qsort(cost, n, sizeof(int), compare); 
    int total_cost = 0;
    for (int i = 0; i < n; i++) {
        if (i % 3 != 2) {
            total_cost += cost[i];
        }
    }
    return total_cost;
}
