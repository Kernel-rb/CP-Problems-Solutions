pub fn percentage_letter(s: String, letter: char) -> i32 {
    let mut counter: i32 = 0;
    let n: i32 = s.len() as i32;
    for i in s.chars() {
        if i == letter {
            counter += 1;
        }
    }
    return (counter * 100) / n;
}