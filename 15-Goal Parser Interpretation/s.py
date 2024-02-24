def interpret(  c: str) -> str:
    y = ""
    for i in range(len(c)): 
        if  c[i] == "G" : 
            y +=  "G"
        elif c[i] == "(" and c[i+1] == ")" : 
           y +=  "o"
        elif c[i] == "(" and c[i+1] == "a"  and c[i+2] == "l" and  c[i+3] == ")" : 
            y += "al"
    return y
print(interpret("G()(al)"))