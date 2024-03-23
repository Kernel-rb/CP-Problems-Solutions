class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        count = 0
        a = 0
        for word in words:
            a = 0
            for i in word:
                if i not in allowed:
                    a = 1
                    break
            if a:
                continue
            
            count += 1
        return count
