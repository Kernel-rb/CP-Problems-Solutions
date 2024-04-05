def premier_occurence(nums , target):
    res = -1
    start = 0
    end = len(nums) - 1  # Fix: subtract 1 from the length to include the last element
    while start <= end :
        midd = (start + end ) // 2 
        if nums[midd] == target :
            res = midd
            end = midd - 1 
        elif nums[midd] < target :
            start = midd + 1
        else :
            end = midd - 1
    return res


print(premier_occurence([1,4,4,9] , 4))