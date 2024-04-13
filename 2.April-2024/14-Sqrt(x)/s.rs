pub fn my_sqrt(x: i32) -> i32 {
    if x == 0 { return 0; }
    if x == 1 { return 1; }
    
    let mut start: i32 = 1;
    let mut end: i32 = x / 2;
    
    while start <= end {
        let mid: i32 = start + (end - start) / 2;
        let square: i64 = mid as i64 * mid as i64;
        
        if square == x as i64 {
            return mid;
        } else if square > x as i64 {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }
    return end; 
}
