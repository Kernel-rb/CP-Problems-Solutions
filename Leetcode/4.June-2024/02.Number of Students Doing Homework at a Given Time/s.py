class Solution:
    def busyStudent(self, startTime: list[int], endTime: list[int], queryTime: int) -> int:
        counter = 0 
        for i in range(len(startTime)) :
            if  startTime[i] <=  queryTime <=endTime[i]: 
                counter += 1
        return counter 


