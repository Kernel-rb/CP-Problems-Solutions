pub fn sum_of_multiples(n: i32) -> i32 
{
    let mut total:i32 = 0;
    for i in 1..n+1
    {
        if i % 3 == 0 || i % 5 == 0 || i % 7 == 0
        {
        total += i;
        }
    }
return total;
}