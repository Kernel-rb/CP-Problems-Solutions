from statistics import *

def somme(a:list[int]) -> int : 
    c =  0 
    for i in a : 
        c += i 
    return c 

def moyenne(a:list[int]) -> float : 
    s = somme(a)
    n = len(a)
    return s/n


r = moyenne([1,2,36,8])
r1 = mean([1,2,36,8])
print(r)
print(r1)
