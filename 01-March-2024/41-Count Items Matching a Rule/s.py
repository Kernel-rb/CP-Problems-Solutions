def countMatches(items: list[list[str]], ruleKey: str, ruleValue: str) -> int:
    # input => array items  && ruleKey && ruelValue 
    # items[i] =  [ type i , color i  , name i ]
    # ruleKey = "type" and ruleValue == type i 
    # ruleKey = "color" and ruleValue == color  i 
    # ruleKey = "name" and ruleValue == name i 
    counter = 0 
    for i in range(len(items)) : 
        if  ruleKey == "type" : 
            if ruleValue == items[i][0]: 
                counter += 1
            else : 
                pass
        elif ruleKey ==  "color"  :
            if ruleValue == items[i][1] : 
                counter += 1
            else : 
                pass 
        elif ruleKey == "name" : 
            if ruleValue == items[i][2] : 
                counter += 1
            else : 
                pass
        else : 
            return f"{ruleKey} is not a valid ruleKay , enter one of those : type or color or name !"
    return counter



print(countMatches(
    items =  [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]],
    ruleKey = "color",
    ruleValue = "silver"
))
