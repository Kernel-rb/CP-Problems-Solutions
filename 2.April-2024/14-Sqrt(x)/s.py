import math
def mySqrt(x: int) -> int:
    if x == 0: 
        return 0 
    if x == 1: 
        return 1
    start = 1
    end = x / 2
    while start <= end: 
        mid = (start + end) // 2 
        if mid * mid == x:
            return int(mid)
        elif mid * mid > x: 
            end = mid - 1
        else: 
            start = mid + 1
    return math.floor((start + end) / 2)

