import sys
import math

def is_happy(n:int) -> bool : 
    deja_vue  = set()
    while n != 1 and n not in deja_vue : 
        deja_vue.add(n)
        n = sum(int(i) ** 2 for i in str(n))   
    return n  == 1 

n = int(input())
for _ in range(n):
    x = input()
    x = int(x)
    print(f"{x} {':)' if is_happy(x) == True else ':('}")
