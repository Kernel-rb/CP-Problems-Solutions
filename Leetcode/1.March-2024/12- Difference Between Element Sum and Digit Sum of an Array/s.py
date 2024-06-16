def differenceOfSum(nums: list[int]) -> int:
        el = sum(nums)
        dg = 0
        for i in nums : 
            for j in str(i):
                dg += int(j)
        return abs(el - dg)

print(differenceOfSum([1,15,6,3]))

