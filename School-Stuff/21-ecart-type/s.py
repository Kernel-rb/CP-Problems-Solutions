from math import *

def moyenne(arr:list[int]) -> float : 
    return sum(arr) / len(arr)

def variance(arr:list[int]) -> float :
    return sum((i- moyenne(arr))**2 for i in arr) / len(arr)

def ecart_type(arr:list[int]) -> float : 
    return sqrt(variance(arr))
