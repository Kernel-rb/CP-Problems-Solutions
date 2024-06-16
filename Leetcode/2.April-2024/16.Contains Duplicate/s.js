/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    let sorted_nums = nums.sort();
    for (let i = 0; i < sorted_nums.length; i++) {
        if (sorted_nums[i] === sorted_nums[i + 1]) {
            return true;
        }
    }
    return false;  
};