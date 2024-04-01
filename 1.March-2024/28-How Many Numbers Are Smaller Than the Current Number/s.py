def smallerNumbersThanCurrent(nums: list[int]) -> list[int]:
    a = []
    for i in range(len(nums)):
        counter = 0
        for j in range(len(nums)):
            if nums[i] > nums[j]:
                counter += 1
        a.append(counter)
    return a


print(smallerNumbersThanCurrent([8,1,2,2,3])) 
