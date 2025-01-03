class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int n = numbers.length;
        int f_pointer = 0;
        int l_pointer = n - 1;
        while (f_pointer < l_pointer) {
            if (numbers[f_pointer] + numbers[l_pointer] == target) {
                result[0] = f_pointer + 1;
                result[1] = l_pointer + 1;
                return result;
            } else if (numbers[f_pointer] + numbers[l_pointer] < target) {
                f_pointer++;
            } else {
                l_pointer--;
            }
        }
        return new int[0];
    }
}

