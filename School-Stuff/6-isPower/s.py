def is_Power(n , p) -> bool :
    for i in range(n+1): 
        if p ** i == n: 
            return True
    return False



r = is_Power(4,2)
r1 = is_Power(7,2)

print(r)
print(r1)
