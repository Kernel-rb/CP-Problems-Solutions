def sortSentence( s: str) -> str:
    a = ""
    w = s.split()
    s_w = sorted(w, key=lambda x: int(x[-1]))
    for i in range(len(s_w)):
        if i == len(s_w) - 1: 
            a += s_w[i].replace(s_w[i][-1] ,"")
        else: 
            a += s_w[i].replace(s_w[i][-1] ," ")
    return a
            
print(sortSentence("is2 sentence4 This1 a3"))