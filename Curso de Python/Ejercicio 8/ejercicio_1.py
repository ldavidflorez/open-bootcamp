f = open("./archivo.txt", "w")
f.write("primera linea\n")
f.close()

f = open("./archivo.txt", "a")
f.write("segunda linea")
f.close()
