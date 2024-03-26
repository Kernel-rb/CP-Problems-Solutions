def countMatches(items: list[list[str]], ruleKey: str, ruleValue: str) -> int:
    counter = 0 
    for i in range(len(items)) : 
        if ruleKey == "type" and ruleValue == items[i][0]: 
            counter += 1
        elif ruleKey == "color" and ruleValue == items[i][1]: 
            counter += 1
        elif ruleKey == "name" and ruleValue == items[i][2]: 
            counter += 1
    return counter

print(countMatches(
    items =  [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]],
    ruleKey = "color",
    ruleValue = "silver"
))
