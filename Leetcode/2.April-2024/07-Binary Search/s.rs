pub fn search(nums: Vec<i32>, target: i32) -> i32 {
    let mut resultat: i32 = -1;
    let mut end: i32 = nums.len() as i32 - 1;
    let mut start: i32 = 0;
    while start <= end {
        let midd: i32 = start + (end - start) / 2;
        if nums[midd as usize] == target {
            resultat = midd as i32;
            break;
        } else if nums[midd as usize] < target {
            start = midd + 1;
        } else {
            end = midd - 1;
        }
    }
    return resultat;
}