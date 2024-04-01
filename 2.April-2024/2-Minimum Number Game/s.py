def numberGame(nums: list[int]) -> list[int]:
    # len(nums) % 2 == 0
    # Alice & Bob decide to play a game
    # in every round , Alice & Bob will do 1 move
    # rule of the game : 
    #       - Every round , first Alice will remove the min(nums) , then Bob will does the sam
    #       - Now , fisrt Bob will **append** the removed elemnt in arr , and then alice does the same
    # the game continue until nums.len() == 0 
    arr = []
    while len(nums) != 0 :
        nums.sort()
        arr.append(nums[1])
        arr.append(nums[0])
        nums.pop(1)
        nums.pop(0)
    return arr
print(numberGame([5,4,2,3]))

    
    





