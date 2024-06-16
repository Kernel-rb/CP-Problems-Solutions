fn premier_occurence(nums: &Vec<i32>, target: i32) -> i32 {
    let mut res: i32 = 0;
    let mut start: i32 = 0;
    let mut end: i32 = nums.len() as i32 - 1;
    while start <= end {
        let mut midd: i32 = (start + end) / 2;
        if nums[midd as usize] == target {
            res = midd;
            end = midd - 1;
        } else if nums[midd as usize] < target {
            start = midd + 1;
        } else {
            end = midd - 1;
        }
    }
    return res;
}

fn main() {
    println!("{}", premier_occurence(&vec![0, 2, 4, 4, 9], 4));
}
