pub fn arithmetic_triplets(nums: Vec<i32>, diff: i32) -> i32 {
    let mut nb_triplets = 0;
    for i in 0..nums.len() {
        for j in i+1..nums.len() {
            if nums[j] - nums[i] == diff {
                for k in j+1..nums.len() {
                    if nums[k] - nums[j] == diff {
                        nb_triplets += 1;
                    }
                }
            } 
        }
    }
    
    return nb_triplets;
}