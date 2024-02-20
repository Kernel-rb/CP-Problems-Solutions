def countDigits(num: int) -> int:
        count = 0
        for i  in str(num):
            print(i)
            if int(i) % int(num):
                count += 1
        return count
            
res = countDigits()
print(res)