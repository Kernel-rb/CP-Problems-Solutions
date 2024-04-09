int arrangeCoins(int n) {
    long start = 1;
    long end  = n ;
    long mid;
    long sum;
    while (start <= end) {
        mid = start + (end - start) / 2;
        sum = mid * (mid + 1) / 2;
        if (sum <= n) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }


    return start - 1;   
}