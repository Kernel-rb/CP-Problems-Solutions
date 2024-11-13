class Solution:
    def intersection(self, n1: List[int], n2: List[int]) -> List[int]:
        return list(set(n1) & set(n2))
