from math import *

def moyenne_quad(arr:list[int]) -> float:
    c = 0
    n = len(arr)
    for i in arr : 
        c += i**2
    return sqrt((1/n) * c)


print(moyenne_quad([1,2,3,4,5,6,7,8,9,10]))
