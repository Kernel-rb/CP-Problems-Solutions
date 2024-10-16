def m(arr:list[int]) -> int : 
    a = arr[0] 
    for i in arr : 
        if i < arr[0] : 
            a = i 
    return a



r = m([-1,45,-4,6,-100])

print(r)
