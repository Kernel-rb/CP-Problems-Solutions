def maximumWealth(accounts: list[list[int]]) -> int:
        total = 0
        for i in accounts : 
            s = sum(i)
            total = max(total , s)
        return total