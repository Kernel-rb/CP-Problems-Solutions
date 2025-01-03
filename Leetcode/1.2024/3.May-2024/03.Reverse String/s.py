def reverseString(self, s: List[str]) -> None:
    n = len(s)
    f_pointer = 0 
    l_pointer = n - 1 
    while f_pointer < l_pointer : 
        s[f_pointer] , s[l_pointer] =  s[l_pointer] , s[f_pointer]
        f_pointer += 1 
        l_pointer -= 1 