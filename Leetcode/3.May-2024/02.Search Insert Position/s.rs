pub fn search_insert(nums: Vec<i32>, target: i32) -> i32 {
        let mut start = 0;
        let mut end = nums.len() as i32 - 1;
        while start <= end {
            let mid = start + (end - start) / 2;
            let mid_index = mid as usize;
            if nums[mid_index] == target {
                return mid_index as i32;
            } else if nums[mid_index] < target {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        start as i32       
}
