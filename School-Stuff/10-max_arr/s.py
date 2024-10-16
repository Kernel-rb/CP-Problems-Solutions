def ma(arr:list[int]) -> int  : 
    ma = arr[0]
    for i in arr : 
        if i > ma : 
            ma = i 
    return ma 



r = ma([-4 , 1000 , 10000000, -100000000])
print(r)
