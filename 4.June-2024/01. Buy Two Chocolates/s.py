class Solution:
    def buyChoco(self, prices: list[int], money: int) -> int:
        prices.sort()
        min_m = [] 
        for i in range(len(prices)):
                for j in range(i+1 , len(prices)) : 
                        a =   prices[i] + prices[j]  
                        if  a  <= money : 
                                min_m.append(a)
                        else : 
                                pass
        if len(min_m) ==  0  : 
                return money 
        else  : 
                return money  - min(min_m)