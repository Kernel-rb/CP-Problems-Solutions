impl Solution {
    pub fn is_array_special(nums: Vec<i32>) -> bool {
        let n = nums.len() as i32;
        if n == 1 {
            return true
        }
        for i in 1..n{
            if nums[(i-1) as usize] % 2 == 0 && nums[i as usize] % 2 == 0 || nums[(i-1) as usize] % 2 != 0 && nums[i as usize] % 2 != 0 {
                return false;
            }
        }
        return true;
    }
}