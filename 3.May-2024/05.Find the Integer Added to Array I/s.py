def addedInteger(nums1: list[int], nums2: list[int]) -> int:
    nums1.sort()
    nums2.sort()
    for i in range(len(nums1)) :
        return   nums2[i] - nums1[i]
        

print(addedInteger([2,6,4]  , [9,7,5]))
print(addedInteger([10], [5]))
print(addedInteger([1,1,1,1] , [1,1,1,1]))
