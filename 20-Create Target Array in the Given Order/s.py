def createTargetArray(nums: list[int], index: list[int]) -> list[int]: 
    target = []
    for i in  range(len(nums)) : 
        for i in range(len(index)) : 
            target.insert(index[i] , nums[i])
        return target
                 
            

print(createTargetArray([0,1,2,3,4] ,[0,1,2,2,1] ))
    
#https://leetcode.com/problems/create-target-array-in-the-given-order