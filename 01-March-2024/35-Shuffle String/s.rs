    pub fn restore_string(s: String, indices: Vec<i32>) -> String {
        let mut a = Vec::new();
        for i in 0..s.len() {
            for j in 0..indices.len() {
                if indices[j] == i as i32 {
                    a.push(s.chars().nth(j).unwrap());
                }
            }
        }
        a.iter().collect()
    }