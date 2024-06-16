def commonFactors(a: int, b: int) -> int:
    nb = 0 
    for i in range(1,1001) :
        if a % i == 0 and b % i == 0 :
            nb  += 1
    return nb
        