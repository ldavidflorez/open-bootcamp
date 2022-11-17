def es_bisiesto(anio):
    # Un año es bisiesto si es divisible entre 4 y no divisible entre 100 o si es divisible entre 400
    p = True if anio % 4 == 0 else False
    q = True if anio % 100 == 0 else False
    r = True if anio % 400 == 0 else False
    return "Es bisiesto" if (p and not(q)) or r else "No es bisiesto"


print(es_bisiesto(2020))
print(es_bisiesto(2022))
print(es_bisiesto(2156))
