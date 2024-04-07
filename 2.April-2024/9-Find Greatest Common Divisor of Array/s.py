def findGCD(nums: list[int]) -> int:
    max_nums = max(nums)
    min_nums = min(nums)
    gcd = []
    for i in range(1,max_nums + 1):
        if max_nums % i == 0 and min_nums % i == 0:
            gcd.append(i)
    return max(gcd)





print(findGCD([2,5,6,9,10]))