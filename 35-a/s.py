def restoreString(s: str, indices: list[int]) -> str:
    a = []
    for i in range(len(s)):
        for j in range(len(indices)):
            if i == indices[j]:
                a.append(s[j])
    return ''.join(a)


print(restoreString("codeleet" , [4,5,6,7,0,2,1,3]))