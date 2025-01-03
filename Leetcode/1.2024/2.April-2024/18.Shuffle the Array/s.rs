pub fn shuffle(nums: Vec<i32>, n: i32) -> Vec<i32> {
    let mut i:i32 = 0 ;
    let mut k:i32 = n;
    let mut a:Vec<i32> = Vec::new();
    while i < n {
        a.push(nums[i as usize ]);
        a.push(nums[k as usize]);
        i += 1;
        k += 1;
    }   
    return a;
}
