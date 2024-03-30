def min_operations(nums: list[int], k: int) -> int:
    num_operations = 0 
    elements_greater_than_k = []
    for num in nums : 
        if num < k : 
            num_operations += 1
        else : 
            elements_greater_than_k.append(num)
    return num_operations


print(min_operations([2,11,10,1,3] , 10))
