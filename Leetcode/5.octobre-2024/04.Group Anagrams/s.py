class Solution:
    def groupAnagrams(self, arr: List[str]) -> List[List[str]]:
        d  = {}
        for i in arr : 
            k = str("".join(sorted(i)))
            if k in d : 
                d[k].append(i)
            else : 
                d[k] = [i]
        return [i for i in d.values()]
        