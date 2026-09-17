class Solution:
    def romanToInt(self, s: str) -> int:
        current_index = 0
        length = len(s)
        value = 0
        values = {
            "I" : 1,
            "V" : 5,
            "X" : 10,
            "L" : 50,
            "C" : 100,
            "D" : 500,
            "M" : 1000
        }

        while(current_index < length):
            if current_index < length - 1 and values.get(s[current_index]) < values.get(s[current_index + 1]):
                difference = values.get(s[current_index + 1]) - values.get(s[current_index])
                value += difference
                current_index += 2
                if current_index >= length:
                    return value
            else:
                value += values.get(s[current_index])
                current_index += 1
                if current_index >= length:
                    return value
