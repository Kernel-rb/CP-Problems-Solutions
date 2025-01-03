def separateDigits(nums: list[int]) -> list[int]:
    arr = []
    for  i in nums : 
        for j in str(i) :
            arr.append(int(j))
    return arr



print(separateDigits([13,25,83,77]))