def sumOddLengthSubarrays(arr: list[int]) -> int:
    sum = 0 
    n = len(arr)
    for i in range(n):
        for j in range(i , n) :
            c = j - i + 1
            if c % 2  == 1 :
                for k in range(i , j+1):
                    sum += arr[k]

    return sum



print(sumOddLengthSubarrays([1,4,2,5,3]))

#https://leetcode.com/problems/sum-of-all-odd-length-subarrays/description/