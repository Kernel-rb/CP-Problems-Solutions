def sumOfEncryptedInt(nums: list[int]) -> int:
    counter = 0 
    for i in nums: 
        n = len(str(i))
        if n == 1:
            counter += i
        else:
            a  = max(str(i)) * n 
            counter += int(a)
    return counter
 
print(sumOfEncryptedInt([1,2,3])) # 1 + 2 + 3 = 6
print(sumOfEncryptedInt([10,21,31])) # 11 + 22 + 33 = 66