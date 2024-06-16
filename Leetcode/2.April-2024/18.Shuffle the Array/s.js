/**
 * @param {number[]} nums
 * @param {number} n
 * @return {number[]}
 */
var shuffle = function(nums, n) {
	let i  =0 ;
	let k = n ; 
	let a = [];
	while(i < n ){
		a.push(nums[i]);
		a.push(nums[k]);
		i++;
		k++;
	};
	return a;
}
