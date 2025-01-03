pub fn roman_to_int(s: String) -> i32 {
    let roman_2_int = {
        let mut map = std::collections::HashMap::new();
        map.insert('I', 1);
        map.insert('V', 5);
        map.insert('X', 10);
        map.insert('L', 50);
        map.insert('C', 100);
        map.insert('D', 500);
        map.insert('M', 1000);
        map
    };
    let mut counter = 0;
    for i in 0..s.len(){
        if i+1 < s.len() && roman_2_int[&s.chars().nth(i).unwrap()] < roman_2_int[&s.chars().nth(i+1).unwrap()]{
            counter -= roman_2_int[&s.chars().nth(i).unwrap()];
        }else{
            counter += roman_2_int[&s.chars().nth(i).unwrap()];
        }
    }
    counter
    }
}