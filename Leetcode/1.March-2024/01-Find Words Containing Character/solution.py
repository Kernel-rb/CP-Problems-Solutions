class Solution:
    def findWordsContaining(self, words, x: str):
        arr =[]
        for i in range(len(words)):
            if x in words[i]:
                arr.append(i)
        return arr 