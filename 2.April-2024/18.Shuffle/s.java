class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int i = 0, k = n;
        while (i < n) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[k];
            i++;
            k++;
        }
        return result;
    }
}
