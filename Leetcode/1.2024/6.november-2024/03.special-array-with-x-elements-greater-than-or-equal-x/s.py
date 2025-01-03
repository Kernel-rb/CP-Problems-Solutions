class Solution:
    def specialArray(self, arr: List[int]) -> int:
        arr.sort()
        for i in range(1 , len(arr) + 1):
            counter = 0 
            for j in arr : 
                if i <= j : 
                    counter += 1
            
            if counter == i : 
                return i 
        return -1
