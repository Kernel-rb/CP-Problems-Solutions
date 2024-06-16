def prefixCount(words: list[str], pref: str) -> int:
    counter = 0
    len_pref = len(pref)
    for i in words: 
        len_of_word = len(i)
        if  len_of_word > len_pref and  pref in i :
                if i.startswith(pref):
                    counter += 1
    return counter

print(prefixCount(["pay","attention","practice","attend"], "at")) # 2 
print(prefixCount(["leetcode","win","loops","success"], "code")) # 0
print(prefixCount(["lcc","psl","bqybsg","rfzpp","bqynodm","bqyjn","ich","bqycn","ylkvdrh","irjg","bqyqwaxg","bqyuyw","bqyywgy","bqyqx","fshrgwj","bqyptjif","bqypg","bqyyfdm","bqyslg","mz"] , "bqy")) # 12 