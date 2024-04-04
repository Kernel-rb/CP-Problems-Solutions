/**
 * @param {number[]} nums
 * @return {number}
 */
var sumOfSquares = function (nums) {
    let counter = 0;
    for (let i = 0; i < nums.length; i++){
        if (nums.length % (i + 1) === 0) {
            let c = nums[i] * nums[i];
            counter += c;
        }
    }
    return counter;
};