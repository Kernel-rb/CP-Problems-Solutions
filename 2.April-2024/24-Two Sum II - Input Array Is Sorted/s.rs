mpl Solution {
    pub fn two_sum(numbers: Vec<i32>, target: i32) -> Vec<i32> {
        let mut arr: Vec<i32> = Vec::new();
        let n = numbers.len();
        let mut f_pointer = 0;
        let mut l_pointer = n as i32 - 1;
        while f_pointer < l_pointer as usize {
            let sum = numbers[f_pointer as usize] + numbers[l_pointer as usize];
            if sum == target {
                arr.push((f_pointer + 1 )as i32);
                arr.push((l_pointer + 1 ) as i32);
                return arr;
            } else if sum < target {
                f_pointer += 1;
            } else {
                l_pointer -= 1;
            }
        }
        Vec::new()
    }
}
