/**
 * @param {string} s
 * @return {number}
 */
var countSegments = function(s) {
    let counter = 0 ;
    let s_arr = s.split(' ');
    for(let i = 0 ; i < s_arr.length ; i++){
        if(s_arr[i] != ''){
            counter++;
        }
    }
    return counter; 
};