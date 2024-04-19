def countSegments(s: str) -> int:
    return len(s.split())


print(countSegments("Hello, my name is John"))# 5
print(countSegments("Hello"))#1
print(countSegments(""))#0
