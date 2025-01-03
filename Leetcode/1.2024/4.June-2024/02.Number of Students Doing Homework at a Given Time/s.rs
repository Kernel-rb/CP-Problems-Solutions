impl Solution {
    pub fn busy_student(start_time: Vec<i32>, end_time: Vec<i32>, query_time: i32) -> i32 {
        let mut counter:i32 = 0 ;
        let n:i32 = start_time.len() as i32;
        for i in 0..n{
            if start_time[i as usize] <= query_time && query_time <= end_time[i as usize] {
                counter += 1;
            }
        }
        return counter;
    }
}