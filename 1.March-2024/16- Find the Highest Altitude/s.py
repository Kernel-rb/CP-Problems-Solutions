def largestAltitude(gain: list[int]) -> int:
        arr = [ 0]
        for i in range(0 ,len(gain)) : 
            arr.append(gain[i] + arr[i])
        return max(arr)
print(largestAltitude([-5,1,5,0,-7]))