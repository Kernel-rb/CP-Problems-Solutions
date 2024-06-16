def search(nums: list[int], target: int) -> int:
    resultat = -1
    start = 0
    end  = len(nums) - 1 
    while start <= end :
        midd = (start + end ) // 2
        if nums[midd] == target : 
            resultat = midd
            break
        elif nums[midd] < target :
            start = midd + 1
        else:
            end = midd - 1
    return resultat

print(search([-1,0,3,5,9,12] , 9))

