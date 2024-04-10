def singleNumber(nums: list[int]) -> int:
    nums.sort()
    pair =  []
    impair = []
    for i in nums :
        if i  % 2 == 0: 
            pair.append(i)
        else :
            impair.append(i)
    return pair + impair