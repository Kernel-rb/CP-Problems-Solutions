def buildArray(nums: list[int]) -> list[int]:
    a = []
    for i in nums:
        a.append(nums[i])
    return a

result = buildArray([0, 2, 1, 5, 3, 4])
print(result)


#https://leetcode.com/problems/build-array-from-permutation/