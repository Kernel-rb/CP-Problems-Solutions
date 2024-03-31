def canBeTypedWords(text: str, brokenLetters: str) -> int:
    counter =  0
    a = text.split()
    for i in a :
        for j in brokenLetters : 
            if j in i :
                counter += 1
    return len(a) - counter

                


print(canBeTypedWords("hello world" , "ad"))
print(canBeTypedWords("leet code" , "e"))
print(canBeTypedWords("leet code" , "lt"))