import pickle


class Vehiculo:
    tipo = None

    def __init__(self, tipo):
        self.tipo = tipo

    def __str__(self):
        return f"Soy un vehiculo de tipo {self.tipo.upper()}"


carro = Vehiculo("carro")
print(carro)

f = open("./carro.bin", "wb")
pickle.dump(carro, f)
f.close()

f = open("./carro.bin", "rb")
carro = pickle.load(f)
f.close()

print(carro)
