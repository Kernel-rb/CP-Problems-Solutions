def finalString(s: str) -> str:
    a = ""
    for i in  s : 
        if i !=  'i':
            a += i
        else: 
            
            a = a[::-1]
    return a
print(finalString("string"))

#https://leetcode.com/problems/faulty-keyboard/description/