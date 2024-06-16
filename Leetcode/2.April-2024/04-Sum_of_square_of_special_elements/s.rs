pub fn sum_of_squares(nums: Vec<i32>) -> i32 {
    let mut counter:i32= 0 ;
    for i in 0..nums.len(){
        if nums.len() % (i + 1) == 0 {
            let mut c:i32=  nums[i] * nums[i];
            counter += c;
        }
    }
    return counter;
}

