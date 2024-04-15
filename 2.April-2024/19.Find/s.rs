impl Solution {
    pub fn find_peaks(m: Vec<i32>) -> Vec<i32> {
        let mut peak:Vec<i32> = Vec::new();
        for i in 1..m.len() -1 {
            if m[i] > m[i+1 as usize] && m[i] > m[i-1 as usize]{
                peak.push(i as i32);
            }
        }
        return peak;
    }
}
