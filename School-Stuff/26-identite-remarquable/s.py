def carre_somme(a: float, b: float) -> float:
    return a**2 + 2*a*b + b**2

def carre_difference(a: float, b: float) -> float:
    return a**2 - 2*a*b + b**2

def produit_somme_difference(a: float, b: float) -> float:
    return a**2 - b**2

def cube_somme(a: float, b: float) -> float:
    return a**3 + 3*a**2*b + 3*a*b**2 + b**3

def cube_difference(a: float, b: float) -> float:
    return a**3 - 3*a**2*b + 3*a*b**2 - b**3

def somme_cube(a: float, b: float) -> float:
    return (a + b) * (a**2 - a*b + b**2)

def difference_cube(a: float, b: float) -> float:
    return (a - b) * (a**2 + a*b + b**2)

