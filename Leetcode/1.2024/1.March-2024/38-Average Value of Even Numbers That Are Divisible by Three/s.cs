public int AverageValue(int[] nums) {
    int nb = 0;
    int len_of_nb = 0;
    for (int i = 0; i < nums.Length; i++) {
        if (nums[i] % 2 == 0 && nums[i] % 3 == 0) {
            nb += nums[i];
            len_of_nb++;
        }
    }
    if (len_of_nb == 0) {
        return 0;
    }
    int res = nb / len_of_nb;
    return res;
}