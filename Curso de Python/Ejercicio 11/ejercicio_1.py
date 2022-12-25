import sqlite3

conn = sqlite3.connect("./Database.db")

# insertando 8 alumnos

# conn.execute(
#     "INSERT INTO Alumnos (Id, Nombre, Apellido) VALUES (1, 'Nom1', 'Ape1')")
# conn.execute(
#     "INSERT INTO Alumnos (Id, Nombre, Apellido) VALUES (2, 'Nom2', 'Ape2')")
# conn.execute(
#     "INSERT INTO Alumnos (Id, Nombre, Apellido) VALUES (3, 'Nom3', 'Ape3')")
# conn.execute(
#     "INSERT INTO Alumnos (Id, Nombre, Apellido) VALUES (4, 'Nom4', 'Ape4')")
# conn.execute(
#     "INSERT INTO Alumnos (Id, Nombre, Apellido) VALUES (5, 'Nom5', 'Ape5')")
# conn.execute(
#     "INSERT INTO Alumnos (Id, Nombre, Apellido) VALUES (6, 'Nom6', 'Ape6')")
# conn.execute(
#     "INSERT INTO Alumnos (Id, Nombre, Apellido) VALUES (7, 'Nom7', 'Ape7')")
# conn.execute(
#     "INSERT INTO Alumnos (Id, Nombre, Apellido) VALUES (8, 'Nom8', 'Ape8')")

# conn.commit()


# busqueda de alumno por nombre

cursor = conn.execute(
    "SELECT Id, Nombre, Apellido from Alumnos WHERE Nombre = 'Nom5'")

for row in cursor:
    print("Id: ", row[0])
    print("Nombre: ", row[1])
    print("Apellido: ", row[2])

conn.close()
