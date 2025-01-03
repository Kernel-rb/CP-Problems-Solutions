/**
 * @param {number[]} nums
 * @return {number}
 */
var findNonMinOrMax = function (nums) {
    if (nums.length < 3) return -1;
    else {
        nums.sort((a, b) => a - b);
        return nums[1];
    }
};



res = findNonMinOrMax([2, 3, 24, 25]); // 4
console.log(res);