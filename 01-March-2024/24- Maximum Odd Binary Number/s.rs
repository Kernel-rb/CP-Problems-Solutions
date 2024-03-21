pub fn count_operations(mut n1: i32, mut n2: i32) -> i32 {
    let mut ops: i32 = 0;
    
    while n1 != 0 && n2 != 0 {
        if n1 > n2 {
            n1  -=  n2;
            ops += 1;
        } else {
            n2 -= n1;
            ops += 1;
        }
    }
    
    ops
}
