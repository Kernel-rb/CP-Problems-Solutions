pub fn common_factors(a: i32, b: i32) -> i32 {
    let mut nb:i32 = 0;
    for i in 1..1001{
        if a % i == 0 && b % i ==0{
            nb += 1
        }
    }
    return nb
    
}