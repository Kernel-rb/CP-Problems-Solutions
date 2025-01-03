pub fn reverse_string(s: &mut Vec<char>) {
    let n = s.len();
    let mut  f_ptr = 0;
    let  mut l_ptr = n - 1;
    while f_ptr < l_ptr {
        s.swap(f_ptr, l_ptr);
        f_ptr += 1;
        l_ptr -= 1;
    }
    
}
