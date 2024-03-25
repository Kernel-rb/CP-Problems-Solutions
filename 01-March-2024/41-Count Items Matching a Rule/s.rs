impl Solution {
    pub fn count_consistent_strings(allowed: String, words: Vec<String>) -> i32 {
        let mut count = 0;
        for i in words.iter() {
            for j in i.chars() {
                if !allowed.chars().any(|c| c == j) {
                    count += 1;
                    break;
                }
            }
        }
        words.len() as i32 - count
    }
}