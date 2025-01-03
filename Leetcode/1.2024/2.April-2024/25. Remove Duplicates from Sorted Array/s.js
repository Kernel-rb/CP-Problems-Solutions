/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let i0 = 0;
    while (i0 < nums.length -1 ) {
        if (nums[i0] === nums[i0 + 1]) {
            nums.splice(i0, 1);
        } else {
            i0++;
        }
    }
    return i0 + 1;  
};