/**
 * @param {number[][]} grid
 * @return {number}
 */
var countNegatives = function(grid) {
    let counter = 0 ;
    for(let i = 0 ; i < grid.length ; i++){
        let start = 0;
        let end = grid[i].length - 1;
        while(start <= end){
            let mid = Math.floor((start + end) / 2);
            if(grid[i][mid] < 0){
                counter += end - mid + 1;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
    }
    return counter;
};