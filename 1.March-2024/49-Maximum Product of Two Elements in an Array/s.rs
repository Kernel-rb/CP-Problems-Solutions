pub fn max_product(mut nums: Vec<i32>) -> i32 {
    nums.sort();
    return (nums[nums.len()-1]-1)*(nums[nums.len()-2]-1);      
}