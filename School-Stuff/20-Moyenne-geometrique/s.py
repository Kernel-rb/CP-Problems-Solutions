def moyenne_geometrique(arr:list[int]) -> float : 
    r:int = 1
    n:int = len(arr)
    for i in arr : 
        r *= i 

    return r ** (1/n)
