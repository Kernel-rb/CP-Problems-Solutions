public int findGCD(int[] nums) {
    int max = nums[0];
    int min = nums[0];
    int gcd = 1:
    int i;
    for (i = 0; i < nums.length; i++) {
        if (nums[i] > max) {
            max = nums[i];
        }
        if (nums[i] < min) {
            min = nums[i];
        }
    }

    for(i = 1 ; i < max + 1; i++) {
        if (max % i == 0 && min % i == 0) {
            gcd = i;
        }
    }
    return gcd;            
}
