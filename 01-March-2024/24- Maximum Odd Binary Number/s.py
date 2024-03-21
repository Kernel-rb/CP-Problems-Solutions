def countOperations(n1: int, n2: int) -> int:
    operation = 0
    while n1 > 0 and n2 > 0: 
        if n1 >= n2: 
            n1 = n1 - n2
            operation += 1
        elif n2 > n1: 
            n2 = n2 - n1 
            operation += 1
    return operation

# https://leetcode.com/problems/count-operations-to-obtain-zero/submissions/1197811215/
print(countOperations(3,2))
print(countOperations(2,3))
print(countOperations(1,1))