def is_np(n) -> bool :
    if n < 2 : return False

    for i in range(2,int(n**0.5)+1):
        if n % i == 0 :
            return  False
    return True
r  = is_np(11) 
r1 = is_np(16)
print(r)
print(r1)
