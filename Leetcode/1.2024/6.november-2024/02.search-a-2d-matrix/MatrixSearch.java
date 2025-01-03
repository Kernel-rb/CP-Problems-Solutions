public class MatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {
            {-8,-8,-7,-7,-6,-5,-3,-2},
            {0,0,1,3,4,6,8,8},
            {11,12,14,16,18,18,19,19},
            {22,23,25,27,28,30,30,31},
            {34,35,37,39,40,42,43,45},
            {48,50,51,51,53,54,55,57},
            {58,60,62,62,62,63,63,65},
            {68,69,71,72,72,72,74,76}
        };
        int target = 76;
        boolean re = searchMatrix(matrix, target);
        System.out.println(re);
    }

    public static  boolean binarySearch(int[][] matrix, int r, int cStart, int cEnd, int target) {
        while(cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if(matrix[r][mid] == target) return true;
            if(matrix[r][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return false;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)return false;
        
        int r = matrix.length;
        int c = matrix[0].length;
        if(r == 1)return binarySearch(matrix, 0, 0, c - 1, target);
        int rStart = 0;
        int rEnd = r - 1;
        
        while(rStart <= rEnd) {
            int mid = rStart + (rEnd - rStart) / 2;
            if(matrix[mid][0] <= target && matrix[mid][c-1] >= target) {
                return binarySearch(matrix, mid, 0, c - 1, target);
            }
            if(matrix[mid][0] > target) {
                rEnd = mid - 1;
            } else {
                rStart = mid + 1;
            }
        }
        return false;
    }
}
