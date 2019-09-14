#The Elements
print('Choose an element: water, earth, fire, air')
element=input()
if element =='water':
    print('Water it is.  Now what would you like your name to be?')
    name=input()
    print('Okay '+name+', would you like to have healing abilities or blood bending?')
    while True:
        choice=input()
        if choice == 'healing abilities':
            print('Very good '+name+'.  You are a '+element+'bender with '+choice)
            break
        if choice == 'blood bending':
            print('Very good '+name+'.  You are a '+element+'bender with '+choice)
            break
        else:
            print('Answer again')
if element =='earth':
    print('Earth it is.  Now what would you like your name to be?')
    name=input()
    print('Okay '+name+', would you like to have metal bending or lava bending?')
    while True:
        choice=input()
        if choice == 'metal bending':
            print('Very good '+name+'.  You are a '+element+'bender with '+choice)
            break
        if choice == 'lava bending':
            print('Very good '+name+'.  You are a '+element+'bender with '+choice)
            break
        else:
            print('Answer again')
if element =='fire':
    print('Fire it is.  Now what would you like your name to be?')
    name=input()
    print('Okay '+name+', would you like to have combustion abilities or lightening bending?')
    while True:
        choice=input()
        if choice == 'combustion abilities':
            print('Very good '+name+'.  You are a '+element+'bender with '+choice)
            break
        if choice == 'lightening bending':
            print('Very good '+name+'.  You are a '+element+'bender with '+choice)
            break
        else:
            print('Answer again')
if element =='air':
    print('Air it is.  Now what would you like your name to be?')
    name=input()
    print('Okay '+name+', would you like to have flight or a flying bison?')
    while True:
        choice=input()
        if choice == 'flight':
            print('Very good '+name+'.  You are a '+element+'bender with '+choice)
            break
        if choice == 'flying bison':
            print('Very good '+name+'.  You are a '+element+'bender with a '+choice)
            break
        else:
            print('Answer again')
print('Go use your abilities for good!')
