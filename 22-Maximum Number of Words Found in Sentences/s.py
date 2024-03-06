def mostWordsFound(sentences: list[str]) -> int:
            y = []
            for i in range(len(sentences)):
                a = sentences[i]
                z = list(a.split(" "))
                y.append(len(z))
            print(max(y))
           
                

mostWordsFound(["alice and bob love leetcode","i think so too","this is great thanks very much"])

#https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/