n = int(input()) 
arr = []

min_value = float('inf')

def eq(v1, e1, v2, e2): 
    return abs(v2 - v1) + abs(e2 - e1)

for i in range(n):
    v, e = [int(j) for j in input().split()]
    arr.append((v, e))

for i in range(len(arr)):
    for j in range(i + 1, len(arr)):
        current_distance = eq(arr[i][0], arr[i][1], arr[j][0], arr[j][1])
        if current_distance < min_value:
            min_value = current_distance

print(min_value)

