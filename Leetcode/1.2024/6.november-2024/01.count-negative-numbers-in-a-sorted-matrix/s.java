class Solution {
    public int countNegatives(int[][] grid) {
        int counter = 0; 
        int r = 0; 
        int c = grid[0].length - 1;
        while( r < grid.length){
            if(grid[r][c] < 0){
                    counter++;
                    c--;
            
            }else{
                r++;
                if(r < grid.length){
                    c = grid[r].length -1;
                }
            }

            if( c < 0 ){
                r++;
                c = grid[0].length - 1;
            }
        }

        return counter;
    }
}
