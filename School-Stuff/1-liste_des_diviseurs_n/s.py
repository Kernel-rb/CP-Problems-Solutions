def s(num) -> list[int] : 
    a = [] 
    for i in range(1,num+1) : 
        if num % i == 0 : 
            a.append(i) 
    return a 

r = s(11) 
print(r)
