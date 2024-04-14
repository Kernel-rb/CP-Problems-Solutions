pub fn is_palindrome(x: i32) -> bool {
    let str_x:String  = x.to_string();
    let z:String = str_x.chars().rev().collect();
    let inverse_z:String = z.chars().rev().collect();

    if str_x == z && z == inverse_z {
        return true;
    }else{
        return false;
    }
}