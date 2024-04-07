def findGCD(nums: list[int]) -> int:
    max_nums = max(nums)
    min_nums = min(nums)
    gcd = 1;
    for i in range(1,max_nums + 1):
        if max_nums % i == 0 and min_nums % i == 0:
            gcd = i
    return gcd





print(findGCD([2,5,6,9,10]))