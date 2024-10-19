def factorielle(n:int) -> int : 
    if n <= 1 :  return 1 
    c = 1
    for i in range(1,n+1):
        c *= i 

    return c 



print(factorielle(4))
