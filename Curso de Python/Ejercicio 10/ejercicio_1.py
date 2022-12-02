from tkinter import Tk, StringVar, Radiobutton, Label, Button


def escribir_opcion():
    opcion = v.get()
    tablero.config(text=f"Opción seleccionada: {opcion}")


def borrar():
    v.set(None)
    tablero.config(text="")


master = Tk()
master.geometry("200x200")

v = StringVar(master, "1")

Radiobutton(master, text="Opción 1", variable=v,
            value='Opción 1', command=escribir_opcion).pack()
Radiobutton(master, text="Opción 2", variable=v,
            value='Opción 2', command=escribir_opcion).pack()
Radiobutton(master, text="Opción 3", variable=v,
            value='Opción 3', command=escribir_opcion).pack()

tablero = Label(master)
tablero.pack()

Button(master, text="Borrar", command=borrar).pack()

master.mainloop()
