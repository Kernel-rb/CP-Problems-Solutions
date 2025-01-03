pub fn build_array(nums: Vec<i32>) -> Vec<i32> {
    let mut a: Vec<i32> = Vec::new();
    for i in &nums {
        a.push(nums[*i as usize]);
    }
    return a
}