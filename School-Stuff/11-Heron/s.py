from math import * 

def heron(n:int  , p :int ) -> int  : 
    u = n 
    while u - sqrt(n) > p : 
        u = 0.5 * (u + n / u )
    return u

print(heron(3 , 10**-4))
print(sqrt(3))
