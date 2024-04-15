/**
 * @param {number[]} m
 * @return {number[]}
 */
var findPeaks = function(m) {
    let peak = [];
    for(let i = 1 ; i < m.length ; i++){
        if(m[i] > m[i+1] && m[i] > m[i-1]){
            peak.push(i);
        }
    }
    return peak;
};
