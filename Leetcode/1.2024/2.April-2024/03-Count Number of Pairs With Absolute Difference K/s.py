def countKDifference(self, nums: List[int], k: int) -> int:
    counter = 0 
    for i in range(len(nums)):
        for j in range(len(nums)):
            if abs(nums[i] - nums[j] == k ):
                counter += 1
    return counter


print(countKDifference([1,2,2,1] , 1))