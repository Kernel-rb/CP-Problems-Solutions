pub fn balanced_string_split(s: String) -> i32 {
 let mut n:i32 = 0;
 let mut n_R:i32 = 0;
 let mut n_L:i32 = 0;
 for c in s.chars() {
     if c == 'R' {
         n_R += 1;
     } else {
         n_L += 1;
     }
     if n_R == n_L {
         n += 1;
         n_R = 0;
         n_L = 0;
     }
 }
 return n;       
}