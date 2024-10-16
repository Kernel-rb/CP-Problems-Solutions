def get_div(num:int ) -> list[int] : 
    arr = []
    for i in range(1,num) : 
        if num % i ==  0 :
            arr.append(i)
    return arr


def nb_parfait(num:int) -> bool : 
    if num == sum(get_div(num)) : return True
    return False
