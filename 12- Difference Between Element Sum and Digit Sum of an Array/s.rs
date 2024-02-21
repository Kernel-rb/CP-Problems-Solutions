pub fn difference_of_sum(nums: Vec<i32>) -> i32 {
    let el:i32 = nums.iter().sum();
    let dig:i32 = 0;
    let f:i32 = el - dig;
    for i in nums
    {
        for j in i.to_string()
        {
            dg += j.parse::<i32>().unwrap();


        }
    }     
    return f.abs()
}