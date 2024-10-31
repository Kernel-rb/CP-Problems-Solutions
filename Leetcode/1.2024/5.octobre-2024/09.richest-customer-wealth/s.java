class Solution {
    public int maximumWealth(int[][] arr) {
        int r = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            int s = 0 ;
            for(int j = 0 ; j < arr[i].length ; j++){
                s += arr[i][j] ;
            }
            if(s > r ) r = s; 
        }
        return r; 
    }
}