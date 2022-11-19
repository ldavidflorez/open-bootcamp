class Vehiculo:
    color = "negro"
    ruedas = 4
    puertas = 5


class Coche(Vehiculo):
    velocidad = 100
    cilindrada = 3


coche = Coche()

print(coche)
