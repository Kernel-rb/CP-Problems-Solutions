def detectCapitalUse(word: str) -> bool:
    if word == word.upper()  or  word == word.lower() or word == word.capitalize():
        return True
    return False


print(detectCapitalUse("USA"))
print(detectCapitalUse("leetcode"))
print(detectCapitalUse("Google"))
print(detectCapitalUse("FlaG"))