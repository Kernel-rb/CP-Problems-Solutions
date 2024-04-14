/**
 * @param {number} x
 * @return {number}
 */
var mySqrt = function(x) {
    if(x < 2) return x;
    let start  = 1;
    let end = x / 2;
    while(start <= end){
        let mid = Math.floor((start + end) / 2);
        if(mid * mid === x) return mid;
        if(mid * mid < x){
            start = mid + 1;
        }else{
            end = mid - 1;
        }
    }
    return end;

};