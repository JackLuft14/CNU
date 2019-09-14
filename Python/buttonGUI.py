import tkinter

def change():
    print("Good job")


window = tkinter.Tk()

label1 = tkinter.Label(window, text="Here is a button")
label1.pack()

button = tkinter.Button(window, text="Click me", command=change)
button.pack()        #has text appear
window.mainloop()   #creates window and waits for user interaction
print("Program finished")
