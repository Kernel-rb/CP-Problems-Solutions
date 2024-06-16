pub fn kids_with_candies(candies: Vec<i32>, extra_candies: i32) -> Vec<bool> {
    let mut a:Vec<bool> = Vec::new();
    let max = *candies.iter().max().unwrap();
    for i in 0..candies.len() {
        if candies[i] + extra_candies >= max {
            a.push(true);
        } else {
            a.push(false);
        }
    }
    return a;
        
}