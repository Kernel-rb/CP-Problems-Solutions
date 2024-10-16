def bubble(arr:list[int]) -> list[int] :
    n = len(arr)
    for i in range(n) : 
        swapped = False
        for j in range(1 , n-i): 
            if arr[j - 1] > arr[j] :
                arr[j-1] , arr[j] = arr[j] , arr[j -1]
                swapped = True
        if not swapped : 
            break
    return arr



r = bubble([-100 , 1, -50, -48963 , 102 , 0, 66, 2 ])
print(r)
