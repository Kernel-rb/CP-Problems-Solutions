/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    let roman_2_int = {
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000
    };
    let counter = 0;
    for (let i = 0; i < s.length; i++) {
        if (roman_2_int[s[i]] < roman_2_int[s[i + 1]]) {
            counter -= roman_2_int[s[i]];
        } else {
            counter += roman_2_int[s[i]];
        }
    }
    return counter;
};