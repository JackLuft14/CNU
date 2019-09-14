#Jack Luft and Justin Rhodes
myList = []
while(True):
    print("Please enter a file name or enter 'X' to exit")
    fileName = input()
    if(fileName == 'X'):
        break
    else:
        try:
            fobj = open(fileName,'r')
        except FileNotFoundError:
            print("file not found")
        else:
            line = fobj.read()
            myList = line.split()
            fobj.close()
            break
while(True):
    print("Please enter a word to search for or enter 'X' to exit")
    word = input()
    inList = False
    if(word == 'X'):
        break
    else:
        for aWord in myList:
            if (word == aWord):
                print(word + " is in " + fileName)
                inList = True
                break
        if(inList == False):
            print(word + " is NOT in " + fileName)
