def hammingWeight(n: int) -> int:
        int_to_bin = bin(n)[2:]
        count = 0 
        for i in int_to_bin :
            if i ==  "1" : 
                count += 1
        return count

