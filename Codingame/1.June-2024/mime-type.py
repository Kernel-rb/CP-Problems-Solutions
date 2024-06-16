n = int(input())
q = int(input())

d = {}
for i in range(n):
    ext, mt = input().split()
    d[ext.lower()] = mt

for i in range(q):
    fname = input().strip()
    if '.' in fname:
        file_ext = fname.rsplit('.', 1)[1].lower()
        print(d.get(file_ext, "UNKNOWN"))
    else:
        print("UNKNOWN")
