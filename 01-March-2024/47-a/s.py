def percentageLetter(s: str, letter: str) -> int:
    counter = 0 
    n = len(s) 
    for i in range(n) :
        if s[i] == letter : 
            counter += 1
    return  int((counter / n) * 100)

print(percentageLetter("foobar"  , "o"))