def balancedStringSplit(s: int) -> int:
    n , n_L , n_R = 0 , 0 , 0
    for char in s  : 
        if char == "R" : 
            n_R  += 1 
        else : 
            n_L += 1
        if n_L == n_R :
            n_L , n_R = 0 , 0
            a += 1 
    return n
    