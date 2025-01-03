def numberOfEmployeesWhoMetTarget(hours: list[int], target: int) -> int:
    emp = 0
    for i in hours : 
        if i >= target : 
            emp += 1
    return emp