def isPalindrome(x: int) -> bool:
    str_x = str(x)
    z = str_x[::-1]
    inverse_z = z[::-1]
    if str_x  == z == inverse_z : 
        return True
    else : 
        return False
