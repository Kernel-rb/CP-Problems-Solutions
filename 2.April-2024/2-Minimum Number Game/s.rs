pub fn number_game(mut nums: Vec<i32>) -> Vec<i32> {
    let mut arr:Vec<i32> = Vec::new();
    while nums.len() != 0
    {
        nums.sort();
        arr.push(nums[1]);
        arr.push(nums[0]);
        nums.remove(1);
        nums.remove(0);
    }
    return arr;
}