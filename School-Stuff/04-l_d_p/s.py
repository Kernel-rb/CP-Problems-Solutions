def check_p(num:int) -> bool : 
    if num < 2 : return False
    for i in range(2 , int(num ** 0.5) + 1) : 
        if num % i == 0 : 
            return False
    return True


def l_d(num :int ) -> list[int] :
    a = []
    for i in range(2 ,num + 1) :
        if num % i  == 0 : 
            a.append(i)
    return a


def l_d_p(l: int ) -> list[int] :
    arr = []
    for i in l_d(l) : 
        if check_p(i): 
            arr.append(i)
    return arr

r = l_d_p(100)
print(r)
