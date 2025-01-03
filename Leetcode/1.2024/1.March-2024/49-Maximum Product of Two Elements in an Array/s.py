def maxProduct(nums: list[int]) -> int:
    nums.sort()
    return (nums[-1] - 1 ) * (nums[-2]  - 1 )




print(maxProduct([3,4,5,2]))