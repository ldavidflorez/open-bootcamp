peso = float(input("Ingrese el peso en Kg: "))
altura = float(input("Ingrese la altura en metros: "))

imc = peso/(altura**2)

print("Tu índice de masa corporal es: " + str(round(imc, 2)))
