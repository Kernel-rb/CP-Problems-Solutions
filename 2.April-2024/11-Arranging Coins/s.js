/**
 * @param {number} n
 * @return {number}
 */
var arrangeCoins = function(n) {
    let couter = 0 ;
    let start = 1;
    while(n >= start){
        n -= start;
        start++;
        couter++;
    }
    return couter;  
};