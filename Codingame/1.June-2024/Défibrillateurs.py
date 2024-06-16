import sys
import math

def convertir_en_rad(r) -> float:
    return float(r.replace(",", ".")) * math.pi / 180

lon = convertir_en_rad(input())
lat = convertir_en_rad(input())

n = int(input())
min_d = float("inf")
proche = ""
for i in range(n):
    defib = input().split(";")
    defib_lon = convertir_en_rad(defib[-2])
    defib_lat = convertir_en_rad(defib[-1])
    z = (defib_lon - lon) * math.cos((defib_lat + lat) / 2)
    y = defib_lat - lat
    d = math.sqrt(z**2 + y**2) * 6371
    if d < min_d:
        min_d = d
        proche = defib[1]

print(proche)
