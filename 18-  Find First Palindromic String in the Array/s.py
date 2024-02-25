def firstPalindrome( w: list[str]) -> str:
    a = ""
    for i in w : 
        if i == i[::-1] : 
            a += i
            break
        else : 
            pass
    return a
print(firstPalindrome(["abc","car","ada","racecar","cool"]))
print(firstPalindrome(["def","ghi"]))
