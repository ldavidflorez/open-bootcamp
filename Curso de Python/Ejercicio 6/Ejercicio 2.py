class Alumno:
    nombre = None
    nota = None

    def __init__(self, nombre, nota):
        self.nombre = nombre
        self.nota = nota

    def __str__(self):
        return f"Soy el alumno {self.nombre} y mi nota es de {self.nota}"

    def aprobado(self):
        return "Aprobado" if self.nota >= 6.0 else "Reprobado"


alumno = Alumno("Luis", 8.5)

print(alumno)
print(alumno.aprobado())
