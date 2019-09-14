from tkinter import *  #don't have to write tkinter every time

def greeting():
    greet.set("Hello, " + name.get())

window = Tk()
window.title("Entry and Button Widgets")
name = StringVar()
entry = Entry(window, textvariable=name)
entry.pack()
greet = StringVar()
button = Button(window, text="OK", command=greeting)
button.pack()
label = Label(window, textvariable=greet)
label.pack()
window.mainloop()
