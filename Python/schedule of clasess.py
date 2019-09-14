def removeNameCommaAndStrip(aList):
    i=0
    listOfLists = [  ]
    while i < len(aList):
        begin = aList[i].find('\"')
        end = aList[i].rfind('\"')
        commaLoc = aList[i].find(',', begin, end)
        listLine = aList[i]
        listLine = listLine[:11] + listLine[12:]
        listLine = listLine.strip( )  #still a string
        listLine = listLine.split(',')
        listOfLists.append(listLine)
        i += 1
    return listOfLists

def createMaster():
    file = open('C:\\Users\\Jack\\Desktop\\ScheduleOfClasses.csv')         #('C:\\Users\\jack.luft\\Desktop\\ScheduleOfCompsciClasses.csv')
    rows = file.readlines( )
    rows = rows[1:]
    masterList = removeNameCommaAndStrip(rows)
    return masterList

def getCategory():
    validCategories = ['A', 'C', 'D', 'I', 'T']
    category = 'x'
    while category not in validCategories:
        print('What would you like to ask about?')
        print('A - Area of Inquiries')
        print('C - Course Number')
        print('D - Days')
        print('I - Instructer')
        print('T - Time')
        category = str(input('----> '))
        category = category.upper()
        if category == validCategories:
            break
        if category not in validCategories:
            print('Not a valid category.')
    return category

def printResults():
    print('results are here')

def printOutput(topic, value, allCourseList):
    if topic == 'A':
        index = 5
    elif topic == 'C':
        index = 1
    elif topic == 'D':
        index = 7
    elif topic == 'I':
        index = 10
    elif topic == 'T':
        index = 8
    else:
        index = 0



keepGoing = 'Y'
while keepGoing == 'Y':
    createMaster()
    topic = getCategory()
    print('Enter the value within the category','(sorted for all)--> ',end='')
    value = input()
    printResults()
    keepGoing = input('Do you want to keep going? (Y/N) --> ')
    keepGoing = keepGoing.upper()
