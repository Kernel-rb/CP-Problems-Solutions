import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

r1 = int(input())
r2 = int(input())

def somme(num: int) -> int:
    return sum(int(i) for i in str(num))

while r1 != r2:
    if r1 < r2:
        r1 += somme(r1)
    else:
        r2 += somme(r2)

print(r1)
