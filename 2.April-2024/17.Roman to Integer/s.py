def romanToInt(self, s: str) -> int:
        roman_to_int = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }
        counter = 0
        for i in range(len(s)):
            if i  < len(s) - 1 and roman_to_int[s[i]] < roman_to_int[s[i+1]]:   
                counter -= roman_to_int[s[i]]
            else:
                counter += roman_to_int[s[i]]
        return counter

        