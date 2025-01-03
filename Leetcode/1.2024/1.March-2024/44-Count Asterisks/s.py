def countAsterisks(s: str) -> int:
        count = 0
        isOdd = True
        for i in s:
            if i=='|':
                isOdd = not isOdd
            if i=='*' and isOdd:
                count+=1
        return count
	