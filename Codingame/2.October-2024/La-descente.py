while True:
    arr = []
    for i in range(8):
        mountain_h = int(input())
        arr.append(mountain_h)
        
    indice = 0  
    max_h = arr[0]
    
    for i in range(1, len(arr)): 
        if arr[i] > max_h:
            max_h = arr[i]
            indice = i
            
    print(indice)  




