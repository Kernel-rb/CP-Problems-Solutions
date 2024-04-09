def arrangeCoins(n: int) -> int:
        """
        sum(arr) => arr.append(n-n0)
        1->   1
        2 ->  1 + n = 2 
        3 ->  1 + 2 +  n = 3
        4 ->  1 + 2 + 3 + 4 
        5 ->  1 + 2 + 3 + 4 + 5 
        6 ->  1 + 2 + 3 + 4 + 5+ 6   
        """
        counter = 0  
        start = 1
        while n > 0  :
            n -= start
            start += 1
            if n  >= 0 : 
                counter += 1
        return counter


print(arrangeCoins(5))