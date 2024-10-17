import sys
import math

# lx: the X position of the light of power
# ly: the Y position of the light of power
# tx: Thor's starting X position
# ty: Thor's starting Y position
lx, ly, tx, ty = [int(i) for i in input().split()]


while True:
    remaining_turns = int(input())  # The level of Thor's remaining energy, representing the number of moves he can still make.

    directionX = ""
    directionY = ""
    thorX = tx
    thorY = ty

    if thorX > lx : 
        directionX = "W"
        tx -= 1
    elif thorX < lx :
        directionX = "E"
        tx += 1

    if thorY > ly :
        directionY = "N"
        ty -= 1
    elif thorY < ly :
        directionY = "S"
        ty += 1

    print(directionY + directionX) 
