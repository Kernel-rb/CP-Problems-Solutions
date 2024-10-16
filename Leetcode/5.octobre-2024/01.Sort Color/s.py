class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        for i in range(n) : 
            swapped = False
            for j in range(1,n - i):
                if nums[j - 1 ] >nums[j] : 
                    nums[j - 1] , nums[j] = nums[j]  , nums[j - 1 ]
                    swapped = True
            if swapped == False: 
                break