pub fn maximum_number_of_string_pairs(words: Vec<String>) -> i32 {
    let mut counter:i32 = 0;
    for i in 0..words.len()
    {
        for j in i+1..words.len()
        {
            if words[i] == words[j].chars().rev().collect::<String>(){
                counter += 1;
            }
        }
    }
    return counter;       
}