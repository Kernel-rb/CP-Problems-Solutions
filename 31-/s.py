def minSubArrayLen(target: int, nums: list[int]) -> int:
    count = float('inf')  
    for i in range(len(nums)):
        subarray_sum = nums[i]
        if subarray_sum == target:
            return 1  
        for j in range(i + 1, len(nums)):
            subarray_sum += nums[j]
            if subarray_sum >= target:
                count = min(count, j - i + 1) 
                break 

    return 0 if count == float('inf') else count 

