def findNonMinOrMax(nums: list[int]) -> int:
        if len(nums) < 3:
            return -1 
        else : 
            nums.sort()
            return nums[1]

print(findNonMinOrMax([3,2,1,4]))
print(findNonMinOrMax([1,2]))
print(findNonMinOrMax([2,1,3]))