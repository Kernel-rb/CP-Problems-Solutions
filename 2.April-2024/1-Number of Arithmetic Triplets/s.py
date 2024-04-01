def arithmeticTriplets(nums: list[int], diff: int) -> int:
    nb_of_arithmetic_triplet = 0 
    for i in range(len(nums)):
        for j in range(i+1 , len(nums)):
            if nums[j] - nums[i] == diff : 
                for k in range(j+1 , len(nums)):
                    if  nums[k] - nums[j]  == diff:
                        nb_of_arithmetic_triplet += 1
    return nb_of_arithmetic_triplet


print(arithmeticTriplets([0,1,4,6,7,10] , 3))