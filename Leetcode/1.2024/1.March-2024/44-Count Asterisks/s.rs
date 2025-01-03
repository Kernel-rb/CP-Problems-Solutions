pub fn count_asterisks(s: String) -> i32 {
        let mut count = 0;
        let mut odd = true;
        
        for i in s.chars() {
            if i == '|' {
                odd = !odd;
            }
            
            if odd && i == '*' {
                count+=1;
            }
        }
        
        return count
    }
