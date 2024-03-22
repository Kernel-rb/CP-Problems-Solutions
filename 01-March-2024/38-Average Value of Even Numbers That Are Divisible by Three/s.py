def averageValue(nums: list[int]) -> float:
    nb = 0 
    len_of_nb = 0
    for i in nums: 
        if i % 6 == 0 : 
            len_of_nb += 1
            nb += i
    if len_of_nb == 0 :
        return 0 
    else : 
        return int(nb // len_of_nb ) 


print(averageValue([9,3,8,4,2,5,3,8,6,1]))