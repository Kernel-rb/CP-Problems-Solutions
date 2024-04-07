def countNegatives(grid: list[list[int]]) -> int:
    counter = 0
    for i in range(len(grid)):
        start = 0
        end = len(grid[i]) - 1
        while start <= end :
            midd = (start + end ) // 2 
            if grid[i][midd] < 0 :
                counter += end - midd + 1
                end = midd - 1 
            else: 
                start = midd + 1
    return counter

print(countNegatives([[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]))


