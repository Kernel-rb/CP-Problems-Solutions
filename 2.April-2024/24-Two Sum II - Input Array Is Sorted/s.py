    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        n = len(numbers)
        f_pointer = 0 
        l_pointer = n - 1
        while f_pointer < l_pointer : 
            if numbers[f_pointer] + numbers[l_pointer] == target : 
                return [f_pointer + 1 , l_pointer + 1]
            elif  numbers[f_pointer] + numbers[l_pointer] < target : 
                f_pointer += 1
            else : 
                l_pointer -= 1
