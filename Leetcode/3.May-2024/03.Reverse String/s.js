/**
 * @param {character[]} s
 * @return {void} Do not return anything, modify s in-place instead.
 */
var reverseString = function(s) {
    let n = s.length;
    let f_ptr = 0;
    let l_ptr = n-1;
    while(f_ptr < l_ptr){
        let temp = s[f_ptr];
        s[f_ptr] = s[l_ptr];
        s[l_ptr] = temp;
        f_ptr++;
        l_ptr--;
    }
};