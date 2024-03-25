/**
 * @param {number[]} nums
 * @return {number[]}
 */
var decompressRLElist = function(nums) {
    let decompressed_list = [];
    for (let i = 0; i < nums.length; i += 2) {
        for (let j = 0; j < nums[i]; j++) {
            decompressed_list.push(nums[i + 1]);
        }
    }
    return decompressed_list;
};