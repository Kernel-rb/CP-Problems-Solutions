class Solution {
    public void setZeroes(int[][] arr) {
        Set<int[]> zeros = new HashSet<>();
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] == 0) {
                    zeros.add(new int[]{r, c});
                }
            }
        }
        for (int[] z : zeros) {
            int r = z[0];
            int c = z[1];
            for (int i = 0; i < arr[r].length; i++) {
                arr[r][i] = 0;
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i][c] = 0;
            }
        }
    }
}
