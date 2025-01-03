def calPoints(ops: list[str]) -> int:
        """
        ops = list[str] & i ope i must apply to the record
        + :=>  sum of previous numbers 
        D :=> double dyal previous score 
        C !=> remove the previous score
        """
        record = []
        for i in ops : 
            if i == "C" :
                del record[-1]
            elif i == "D" : 
                record.append(record[-1] * 2)
            elif i == "+" :
                record.append(record[-1] + record[-2] )
            else :
                record.append(int(i))
        return sum(record)



print(calPoints(["5","2","C","D","+"]))
print(calPoints(["5","-2","4","C","D","9","+","+"]))
print(calPoints(["1","C"]))
