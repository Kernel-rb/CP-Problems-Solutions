pub fn sort_array_by_parity(nums: Vec<i32>) -> Vec<i32> {
    let mut pair: Vec<i32> = Vec::new();
    let mut impair: Vec<i32> = Vec::new();
    for i in &nums {
        if i % 2 == 0 {
            pair.push(*i);
        } else {
            impair.push(*i);
        }
    }
    pair.extend(impair);
    return pair;
}
