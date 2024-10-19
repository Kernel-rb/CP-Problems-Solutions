import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

"""
Enonce  : 
- card_len = 16;
- The leftmost 6 digits represent a unique identification number for the bank who has issued the card;
- The next 2 digits determine the type of the card (e.g., debit, credit, gift) 
- Digits 9 to 15 are the serial number of the card, and the last digit is used as a control digit to verify whether the card number is valid
"""

"""
Etapes : 
- 
"""
# step 1 & 2
n = int(input())
for i in range(n):
    card = input()
    arr = []
    odd = 0 
    for j in card.split(" "):
        for k in range(0 , len(j), 2):
            if(len(str(int(j[k]) * 2))) > 1 : 
                arr.append((int(j[k]) * 2) - 9)
            else :
                arr.append(int(j[k])*2)
        for l in range(len(j)) : 
            if l % 2 != 0 : 
                odd += int(j[l])
    r = odd + sum(arr)
    if r % 10 == 0 : 
        print("YES")
    else:
        print("NO")
