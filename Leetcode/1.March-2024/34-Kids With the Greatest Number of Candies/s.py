class Solution:
    def kidsWithCandies(self, candies: list[int], extraCandies: int) -> list[bool]:
        a = []
        max_Candies = max(candies)
        for i in range(len(candies)):
            if candies[i] + extraCandies >=  max_Candies :
                a.append(True)
            else : 
                a.append(False)
        return a
        