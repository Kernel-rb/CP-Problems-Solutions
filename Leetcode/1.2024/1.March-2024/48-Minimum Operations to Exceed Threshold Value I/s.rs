pub fn min_operations(nums: Vec<i32>, k: i32) -> i32 {
    let mut nb_of_operations:i32 = 0;
    let mut elements_greatter_than_k:Vec<i32> = Vec::new();
    for i in 0..nums.len() {
        if nums[i]< k {
            nb_of_operations += 1;
        }else{
            elements_greatter_than_k.push(i as i32);
        }
    }
    return nb_of_operations;       
}