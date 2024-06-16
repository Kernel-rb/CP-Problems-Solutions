/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    let str_x = x.toString();
    let z = str_x.split('').reverse().join('');
    let inverse_z = z.split('').reverse().join('');
    if (str_x === z && z === inverse_z) {
        return true;
    }
    return false;
    
};