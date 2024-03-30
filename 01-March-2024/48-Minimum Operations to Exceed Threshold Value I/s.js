/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var minOperations = function(nums, k) {
    let nb_of_operations = 0;
    let elements_greater_than_k = [];
    for (let i = 0; i < nums.length; i++) {
        if(nums[i] < k){
            nb_of_operations++;
        }else{
            elements_greater_than_k.push(i);
        }
    }
    return nb_of_operations;
};