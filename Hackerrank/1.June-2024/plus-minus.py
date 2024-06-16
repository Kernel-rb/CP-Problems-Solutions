#!/bin/python3

import math
import os
import random
import re
import sys


def plusMinus(arr) -> float:
    n = len(arr)
    neg = 0
    pos = 0
    z =  0 
    for i in arr : 
        if i  == 0 : 
            z += 1 
        elif i >  0 : 
            pos += 1 
        else : 
            neg += 1
    print(pos/n)
    print(neg/n)
    print(z/n)

if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)
