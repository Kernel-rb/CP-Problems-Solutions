pub fn smallest_even_multiple(n: i32) -> i32 {
    if n % 2 == 0 {
        return n;
    }
    return 2*n
}