def moyenne_armonique(arr:list[int]) -> float : 
    n:int = len(arr)
    s:float = 0 
    for i in arr : 
        s += 1/i
    
    return n/s
