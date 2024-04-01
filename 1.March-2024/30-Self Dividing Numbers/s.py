def selfDividingNumbers(left: int, right: int) -> list[int]:
    a = []
    for i in range(left , right + 1 , 1 ):
        for j in str(i): 
            if int(j) == 0 or int(i) % int(j) != 0:
                break
        else:
            a.append(i)
    return a 

print(selfDividingNumbers(1 , 22))
