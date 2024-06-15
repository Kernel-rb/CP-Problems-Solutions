import math

# user  info
lon = input()
lon = float(lon.replace(',', '.'))
lon =  lon * math.pi / 180
lat = input()
lat = float(lat.replace("," , "."))
lat = lat * math.pi / 180

n = int(input())
min_distance = float('inf') 
for i in range(n):
    defib = input()
    arr = defib.split(";")
    defib_lon = arr[4]
    defib_lon = float(defib_lon.replace("," , ".")) 
    defib_lon = defib_lon * math.pi / 180
    defib_lat = arr[5] 
    defib_lat = float(defib_lat.replace("," , "."))
    defib_lat = defib_lat * math.pi / 180

    distance = 0
    x = (defib_lon -lon ) * math.cos((defib_lat + lat) / 2)
    y = (defib_lat -lat )
    d =  math.sqrt((x**2) + (y**2)) * 6371
    if d < min_distance:
        min_distance = d
        nearest = arr[1]
print(nearest)



