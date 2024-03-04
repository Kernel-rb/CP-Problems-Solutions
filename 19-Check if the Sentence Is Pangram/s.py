def checkIfPangram(sentence: str) -> bool:
        alphabet = "abcdefghijklmnopqrstuvwxyz"
        for char in alphabet :
            if char not in sentence: 
                return False
        return True


#https://leetcode.com/problems/check-if-the-sentence-is-pangram/