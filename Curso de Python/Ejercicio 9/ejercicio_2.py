from functools import reduce

lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

lista_impares = filter(lambda x: x%2 != 0, lista)
suma = reduce(lambda x, y: x + y, lista_impares)

print(f"La suma de los impares en la lista es: {suma}")