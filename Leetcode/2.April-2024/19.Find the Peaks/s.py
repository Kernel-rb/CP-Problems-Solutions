    def findPeaks(m: List[int]) -> List[int]:
        peak = []
        for i in range(1 , len(m) - 1 )  :
            if m[i] > m[i-1] and m[i] > m[i+1]: 
                 peak.append(i)
        return peak
