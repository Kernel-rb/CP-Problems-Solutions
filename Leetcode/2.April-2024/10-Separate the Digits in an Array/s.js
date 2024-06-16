/**
 * @param {number[]} nums
 * @return {number[]}
 */
var separateDigits = function(nums) {
    let arr  = [];
    for(let i =  0 ; i < nums.length ; i++){
        for(let j = 0 ; j < nums[i].toString().length ; j++){
            arr.push(parseInt(nums[i].toString()[j]))
        }
    }
    return arr;
};