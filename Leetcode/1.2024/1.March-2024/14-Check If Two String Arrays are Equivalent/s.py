def arrayStringsAreEqual(word1: list[str], word2: list[str]) -> bool:
        if "".join(i for i in word1) == "".join(i for i in word2) :
               return True
        

print(arrayStringsAreEqual(["ab" , "c"] , ["a" , "bc"]))