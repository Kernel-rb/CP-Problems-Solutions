def countPairs(nums: list[int], target: int) -> int:
        count  = 0 
        n = len(nums)
        for i in range(n):
            print(nums[i])
            for j in range(i+1 , n) :
                print(nums[j])
                if nums[i]  + nums[j] < target :
                    count += 1
        print(f"the count = {count} ") 


countPairs([-1,1,2,3,1] , 2)