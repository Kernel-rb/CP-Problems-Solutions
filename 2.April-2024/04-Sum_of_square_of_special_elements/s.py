class Solution:
    def sumOfSquares(self, nums: List[int]) -> int:
        counter = 0
        n  = len(nums)
        for i in range(n):
            if n % (i +1) == 0 : 
                c = nums[i] * nums[i]
                counter += c
        return counter