def isSameAfterReversals(num: int) -> bool: 
    str_num = str(num)
    reverse_str_num = str_num[::-1]
    for i in reverse_str_num : 
        if i ==  '0' : 
            new_reverse_num = reverse_str_num.replace('0','')
    new_reverse_num = reverse_str_num[::-1]

    if str_num == new_reverse_num : 
        return True 
    else : 
        return False


print(isSameAfterReversals(1800))