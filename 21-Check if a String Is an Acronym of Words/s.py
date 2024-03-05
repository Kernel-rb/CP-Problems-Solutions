def isAcronym(words: list[str], s: str) -> bool:
    a = ""
    
    for i in words : 
        a += i[0]
    if a  == s :
        return True
    else : 
        return False    

print(isAcronym(["alice","bob","charlie"] ,"abc" ))


#https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words