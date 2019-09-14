# Jack Luft - Asg 4

# Changes any cloud bordering a land mass into land
def cloudToLand(strings, listIndex, wordIndex):
    if (wordIndex > 0):
        if (strings[listIndex][wordIndex-1] == 'C'):
            strings[listIndex] = strings[listIndex][:wordIndex-1] + 'L' + strings[listIndex][wordIndex:]

    if (wordIndex < len(strings[listIndex])-1):
        if (strings[listIndex][wordIndex+1] == 'C'):
            strings[listIndex] = strings[listIndex][:wordIndex+1] + 'L' + strings[listIndex][wordIndex+2:]

    if (listIndex > 0):
        if (strings[listIndex-1][wordIndex] == 'C'):
            strings[listIndex-1] = strings[listIndex-1][:wordIndex] + 'L' + strings[listIndex-1][wordIndex+1:]

    if (listIndex < len(strings)-1):
        if (strings[listIndex+1][wordIndex] == 'C'):
            strings[listIndex+1] = strings[listIndex+1][:wordIndex] + 'L' + strings[listIndex+1][wordIndex+1:]

    return strings

# Recursively changes all connected land masses to same symbol
def landToNum(strings, listIndex, wordIndex, num):
    char = ''
    if (num < 10):
        char = str(num)
    elif (num == 10):
        char = '?'
    elif (num == 11):
        char = '!'
    elif (num == 12):
        char = '@'
    elif (num == 13):
        char = '#'
    elif (num == 14):
        char = '$'
    elif (num == 15):
        char = '%'
    elif (num == 16):
        char = '^'
    elif (num == 17):
        char = '&'
    elif (num == 18):
        char = '*'
    elif (num == 19):
        char = '('
    elif (num == 20):
        char = ')'
    else:
        char = '-'

    strings[listIndex] = strings[listIndex][:wordIndex] + char + strings[listIndex][wordIndex+1:]

    if (wordIndex > 0):
        if (strings[listIndex][wordIndex-1] == 'L'):
            strings = landToNum(strings, listIndex, wordIndex-1, num)

    if (wordIndex < len(strings[listIndex])-1):
        if (strings[listIndex][wordIndex+1] == 'L'):
            strings = landToNum(strings, listIndex, wordIndex+1, num)

    if (listIndex > 0):
        if (strings[listIndex-1][wordIndex] == 'L'):
            strings = landToNum(strings, listIndex-1, wordIndex, num)

    if (listIndex < len(strings)-1):
        if (strings[listIndex+1][wordIndex] == 'L'):
            strings = landToNum(strings, listIndex+1, wordIndex, num)

    return strings

# Determines the minimal number of islands
def process(strings):
    if strings == None:
        return -1

    numIslands = 0
    nStrings = strings[:]

    #find clouds next to land and change to land
    listInd = 0
    strnInd = 0
    numloop = 0
    while (listInd < len(strings)):
        tempstr = nStrings[listInd]
        numloop = 0
        while (numloop < len(tempstr)):
            tempstr = nStrings[listInd]
            strnInd = 0
            while(strnInd < len(tempstr)):
                if (tempstr[strnInd] == 'L'):
                    nStrings = cloudToLand(nStrings, listInd, strnInd)
                strnInd += 1

            numloop += 1
            
        listInd += 1


    #count number of land masses
    listInd = 0
    strnInd = 0

    while (listInd < len(nStrings)):
        while ('L' in nStrings[listInd]):
            numIslands += 1
            nStrings = landToNum(nStrings, listInd, nStrings[listInd].find('L'), numIslands)

        listInd += 1


    return numIslands
