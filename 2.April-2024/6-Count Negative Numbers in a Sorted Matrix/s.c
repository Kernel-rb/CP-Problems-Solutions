int countNegatives(int** grid, int gridSize, int* gridColSize) {
    int counter = 0 ;
    int i;
    for(i = 0 ; i < gridSize ; i++){
        int start = 0 ;
        int end = gridColSize[i] - 1;
        while(start <= end){
            int midd = (end + start) / 2;
            if(grid[i][midd] < 0){
                counter +=  end  - midd + 1;
                end  = midd - 1;
            }else{
                start = midd +1;
            }
        }
    }
    return counter;
}