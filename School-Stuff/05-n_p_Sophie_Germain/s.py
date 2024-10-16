def check_p(num : int ) -> bool: 
    if num < 2 :  return False 
    for i in range(2,int(num**0.5) + 1 ) :
        if num % i == 0 : 
            return False
    return True


def n_p_sophie_germain(num : int) -> bool : 
    if check_p(num)  and check_p(2 * num + 1): 
        return True
    return False

def l_n_p_s_g(d:int,f:int)  -> list[int] : 
    arr = []

    for i in range(d , f+1 ): 
        if n_p_sophie_germain(i) : 
            arr.append(i)
    return arr

r = l_n_p_s_g(2,4)
print(r)
