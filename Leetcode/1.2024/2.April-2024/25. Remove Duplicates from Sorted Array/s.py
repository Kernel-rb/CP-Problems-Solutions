def removeDuplicates(nums: list[int]) -> int:
    i0 = 0 
    while i0 < len(nums)-1:
        if nums[i0] == nums[i0+1]:
            nums.pop(i0)
        else:
            i0 += 1
    return i0 + 1



print(removeDuplicates([1,1,2]))
print(removeDuplicates([0,0,1,1,1,2,2,3,3,4]))