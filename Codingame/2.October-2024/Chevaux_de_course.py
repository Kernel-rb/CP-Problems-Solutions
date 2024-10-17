import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.
arr = []

n = int(input()) # n total de chevaux 
for i in range(n):
    pi = int(input())
    arr.append(pi)


arr.sort()
c = float('inf')
for j in range(1,len(arr)):
    if c > arr[j] - arr[j-1] :
        c = arr[j] - arr[j-1]