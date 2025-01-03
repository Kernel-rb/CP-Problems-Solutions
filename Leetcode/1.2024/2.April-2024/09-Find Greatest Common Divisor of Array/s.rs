pub fn find_gcd(nums: Vec<i32>) -> i32 {
    let mut min = nums[0];
    let mut max = nums[0];
    let mut gcd = 1:
    for i in nums{
        if i < min{
            min = i;
        }
        if i > max{
            max = i;
        }
    }
    for i in 1..max+1{
        if min % i == 0 && max % i == 0{
            gcd = i;
        }
    }
    return gcd
}