def check_p(n) -> bool : 
    if n < 2 :  return False 
    
    for i in range(2,int(n ** 0.5) + 1) : 
        if n % i == 0 : 
            return False
    return True


def l_np(d , f) -> list[int] : 
    a  = []
    for i in range(d , f): 
        if check_p(i) == True : 
            a.append(i)
    return a



r = l_np( 11 , 100)
print(r)
