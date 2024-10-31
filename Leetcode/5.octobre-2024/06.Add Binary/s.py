class Solution:
    def addBinary(self, a: str, b: str) -> str:
        # convert both from Binary String to Int and slice [2:] cuz it return 0bXXX
        return bin(int(a, 2) + int(b, 2))[2:]