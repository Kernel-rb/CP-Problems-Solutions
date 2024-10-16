def func(a:int , b : int ) -> tuple[int,int] :
    temp =a 
    a = b 
    b = temp 
    return a , b


def ez(a:int , b:int ) -> tuple[int , int] : 
    a , b = b , a
    return a , b
