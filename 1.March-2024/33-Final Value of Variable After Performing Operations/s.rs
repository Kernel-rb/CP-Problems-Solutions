impl Solution {
    pub fn final_value_after_operations(operations: Vec<String>) -> i32 
    {
        let mut x:i32 = 0 ;
        for i in 0..operations.len()
        {
            if operations[i] == "--X" ||  operations[i] == "X--"{
                x -= 1;
            }else{
                x += 1;
            }
        }
        return x;
    }
}