def shuffle(nums:list[int] , n:int) -> list[int] : 
    i = 0  
    k = n 
    a = []
    while i < n : 
        a.append(nums[i])
        a.append(nums[k])
        i += 1
        k += 1 
    return a
