impl Solution {
    pub fn count_digits(num: i32) -> i32 
    {        
        let mut counter: i32 = 0;
        for i in num.to_string().chars() {
            if num % i.to_digit(10).unwrap() as i32 == 0 {
                counter += 1;
            }
        }
        counter
    }
}