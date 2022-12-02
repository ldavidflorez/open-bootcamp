from tkinter import Tk, Listbox, Label, END

master = Tk()
master.geometry("200x200")

listbox = Listbox()
listbox.insert(END, "A", "B", "C")
listbox.pack()

label = Label(master, text="ALGO")
label.pack()

master.mainloop()
