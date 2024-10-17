n = int(input())  
arr = list(map(int, input().split()))

p_arr = []
n_arr = []

for i in arr: 
    if i >= 0: 
        p_arr.append(i)
    else: 
        n_arr.append(i)
p_arr_closest_to_0 = min(p_arr) if p_arr else None 
n_arr_closest_to_0 = max(n_arr) if n_arr else None 

if p_arr_closest_to_0 is not None and n_arr_closest_to_0 is not None:
    if abs(n_arr_closest_to_0) == p_arr_closest_to_0:
        print(p_arr_closest_to_0)
    elif abs(n_arr_closest_to_0) < p_arr_closest_to_0:
        print(n_arr_closest_to_0)
    else:
        print(p_arr_closest_to_0)
elif p_arr_closest_to_0 is not None: 
    print(p_arr_closest_to_0)
elif n_arr_closest_to_0 is not None:  
    print(n_arr_closest_to_0)
else:
    print(0) 
