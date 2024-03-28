def countAsterisks(s: str) -> int:
        count = 0
        a = True
        for i in s:
            if i=='|':
                a = not a
            if i=='*' and a:
                count+=1
        return count
	