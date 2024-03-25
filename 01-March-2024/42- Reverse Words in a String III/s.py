def reverseWords(s: str) -> str:
    splitted_str = s.split(" ") 
    for i in range(len(splitted_str)):
        if splitted_str[i] != '':
            splitted_str[i] = splitted_str[i][::-1]
    return ' '.join(splitted_str)
print(
    reverseWords("Let's take LeetCode contest")
)

