paises = input("Ingresar lista de paises separados por coma: ")

paises = sorted(list(set(paises.split(","))))
paises = ",".join(paises)

print(f"La lista de paises ordenada es: {paises}")

