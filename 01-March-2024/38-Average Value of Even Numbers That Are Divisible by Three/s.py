def averageValue(nums: list[int]) -> int:
    even_numbers = 0  
    for i in nums: 
        if i % 3 == 0 : 
            even_numbers += i 
    return even_numbers 



print(averageValue( [1,3,6,10,12,15]))