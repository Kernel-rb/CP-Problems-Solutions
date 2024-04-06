pub fn maximum_count(nums: Vec<i32>) -> i32 {  
    let mut pos:i32 = 0;
    let mut neg:i32 = 0;
    for i in nums {
        if i > 0 {
            pos += 1;
        } else if i < 0 {
            neg += 1;
        }
    }
    return if pos > neg { pos } else { neg };
}