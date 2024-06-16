pub fn arrange_coins(mut n: i32) -> i32 {
    let mut counter:i32 = 0 ;
    let mut  start:i32 = 1;
    while n >= 0
    {
        n  -= start ;
        start += 1;
        {
        if n >= 0
            counter += 1;
        }
    }

    return counter;
}