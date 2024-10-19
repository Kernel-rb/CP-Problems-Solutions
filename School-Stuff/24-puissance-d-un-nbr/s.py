def puissance(n: float, p: int) -> float:
    if n < 0 and p < 0:
        n = 1 / n
        p = -p
    if p == 0:
        return 1
    if n == 0:
        return 0  

    r = 1
    for _ in range(abs(p)):  
        r *= n

    if p < 0:
        return 1 / r  
    return r

